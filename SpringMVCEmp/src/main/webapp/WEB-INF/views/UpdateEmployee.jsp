


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateemployee" method="post">

Employee Number<input type="text" name="code"  value="${emp.empno}" readonly="readonly" ><br>
Name<input type="text" name="ename"  value="${emp.ename}" ><br>
Job<input type="text" name="job"  value="${emp.job}" ><br>
manager id<input type="text" name="mgr"  value="${emp.mgr}" ><br>
Salary<input type="text" name="sal"  value="${emp.sal}" ><br>
Commission<input type="text" name="comm"  value="${emp.comm}" ><br>
Department-Number<input type="text" name="deptno"  value="${emp.deptno}" ><br>
<input type="submit">
</form>
</body>
</html>