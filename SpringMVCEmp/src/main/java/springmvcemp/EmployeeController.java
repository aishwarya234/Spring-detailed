package springmvcemp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import beans.Employee;

@Controller
public class  EmployeeController{
	@Autowired
	EmployeeDao dao;
	@RequestMapping(value="/addemp",method=RequestMethod.GET)
	public String  showAddEmployeeForm(){
		return "AddEmployee";
	}
	
	@RequestMapping(value="/addemp",method=RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("emp")Employee emp){
		
		ModelAndView mav=new ModelAndView();
		dao.addEmployee(emp);
		//dao.updateCustomer(cust.getCode());
		mav.setViewName("redirect:viewemployees");
		return mav;
	}
	
	
	@RequestMapping(value="/viewemployees")
	public ModelAndView getCustomers(){
		
		ModelAndView mav=new ModelAndView();
		List<Employee> list=dao.getEmployees();
		mav.addObject("employees",list);
		mav.setViewName("ViewEmployees");
		return mav;
		
		
	}
	//here
	
	@RequestMapping(value="/updateemployee",method=RequestMethod.GET)
	public ModelAndView showUpdateEmployeeForm(int code){
		
		Employee emp=dao.getEmployees(code);
		ModelAndView mav=new ModelAndView();
		mav.addObject("emp",emp);
		mav.setViewName("UpdateEmployee");
		return mav;
	}
	@RequestMapping(value="/updateemployee",method=RequestMethod.POST)
	public ModelAndView updateEmployee(@ModelAttribute("employee")Employee emp){
		
		ModelAndView mav=new ModelAndView();
		dao.updateEmployees(emp);
	
		mav.setViewName("redirect:viewemployees");
		return mav;
	}
	
	@RequestMapping(value="/deleteemp",method=RequestMethod.GET)
	public ModelAndView deleteCustomers(int code){
		
		Employee emp=dao.getEmployees(code);
		ModelAndView mav=new ModelAndView();
		dao.deleteEmployee(emp);
		mav.addObject("emp",emp);
		mav.setViewName("redirect:vieweployees");
		return mav;
	}
	
	
	
	
	
	
	
}