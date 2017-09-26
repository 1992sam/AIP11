<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home Page</title>
	</head>

	<body>
		
		<h1 align="center">Home page</h1><br><br>
		<form:form>
			<table>
				<tr><td><form:select path="events">
					<form:options items = "Item 1" />
					<form:options items = "Item 2" />
				</form:select></td>
				<td><input type="submit" value = "Select Event" /></td></tr>
			</table>
		</form:form>	
			<br><<br><a href = "/getBooking">View your Bookings</a>
			
			<br><br><a href = "/editAccount">Update Account Details</a>
			
			<br><<br><a href = "/logout">Logout</a>
			
			<br><br><a href = "/admin">Administrator Settings</a>
		
	</body>
</html>