<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addemp" method="post">
Enter Employee Code:<input type="text"  name="empno"><br>
Enter Employee Name:<input type="text" name="ename"><br>
Select job title:<input list="job" name="job">
<datalist id="job">
<option value="Manager">Manager</option>
<option value="Salesman">SalesMan</option>
<option value="Analyst">Analyst</option>
<option value="Clerk">Clerk</option>
<option value="President">President</option>
</datalist><br>
Manager Id:<input type="text" name="mgr"><br>
Hire Date:<input type="date"  name="hiredate"><br>
Salary:<input type="text"  name="sal"><br>
Commission:<input type="text" name="comm"><br>
Department Number:<input type="text" name="deptno"><br>
Department Name:<input type="text" name="dname"><br>
Location:<input type="text" name="loc"><br>
<input type="submit">
</form>
</body>
</html>