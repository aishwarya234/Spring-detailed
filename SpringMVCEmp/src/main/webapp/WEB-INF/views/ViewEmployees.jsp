<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
		<tr><th>Employee Number<TH>Employee NAME<th>Job<th>Manager-id<th>Hiredate<th>Salary<th>Commission<th>Department-Number</TH></tr>
		<c:forEach var="emp" items="${employees}"> 
			<tr>
				<td><c:out value="${emp.empno}"></c:out></td>
				<td><c:out value="${cust.ename}"></c:out></td>
				<td><c:out value="${cust.job}"></c:out></td>
				<td><c:out value="${cust.mgr}"></c:out></td>
				<td><c:out value="${cust.hiredate}"></c:out></td>
				<td><c:out value="${cust.sal}"></c:out></td>
				<td><c:out value="${cust.comm}"></c:out></td>
				<td><c:out value="${cust.deptno}"></c:out></td>	
				<td><a href="updateemployee?code=${emp.empno}">Update</a></td>
				<td><a href="deleteemployee?code=${emp.empno}">Delete</a></td>
			</tr>
		</c:forEach>
	</table><br>
	<a href="addcust">Add Customer</a>

</body>
</html>