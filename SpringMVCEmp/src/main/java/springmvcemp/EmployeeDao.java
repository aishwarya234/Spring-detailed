package springmvcemp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory sessionfactory;
		
		public void setSessionFactory(SessionFactory sessionFactory){
			this.sessionfactory=sessionFactory;
		}
		
	public void addEmployee(Employee emp){
		
		Session session=(Session) sessionfactory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		session.save(emp);
		try{
		tx.commit();}
		
		catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		
	}
	
	public List<Employee> getEmployees(){
		Session session=(Session) sessionfactory.openSession();
		@SuppressWarnings("unchecked")
		
		List<Employee> employeelist=session.createQuery("from Employee").list();
		return employeelist;
	}
	
	
	public Employee getEmployees(int code) {
		Session session=(Session) sessionfactory.openSession();
		Employee emp= (Employee) session.get(Employee.class, code);
		return emp;
		
	}

	public void updateEmployees(Employee emp) {
		// TODO Auto-generated method stub
		
		Session session=(Session) sessionfactory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		session.update(emp);
		try{
		tx.commit();}
		
		catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		
		
	}

	public void deleteEmployee(Employee emp) {
		
		Session session=(Session) sessionfactory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		session.delete(emp);
		try{
		tx.commit();}
		
		catch(Exception e){
			e.printStackTrace();
		}
		session.close();
		
	}


	

	
	
	
}
