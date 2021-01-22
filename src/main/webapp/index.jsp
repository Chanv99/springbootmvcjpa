<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to ABC industeries</h1>
	<form action="addEmployee">
		<h2>To enter employee</h2>
		Enter Employee id <input type="text" name="eid"><br>
		Enter Employee name<input type="text" name="ename"><br>
		<input type="submit">
	</form>
	<hr>
	<form action="getEmployee"><br>
		<h2>To fetch a particular Employee</h2>
		Enter Employee id<input type="text" name="eid"><br>
		<input type="submit">
	</form>
	<hr>
	<form action="getEmployeeByName"><br>
		<h2>To fetch a particular Employee by name</h2>
		Enter Employee name<input type="text" name="ename"><br>
		<input type="submit">
	</form>
	<hr>
	<form action="getEmployees">
		<h2>To get all Employees</h2>
		<input type="submit"><br>
	</form>
	
</body>
</html>