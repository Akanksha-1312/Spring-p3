<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="update">
	<table >
	
			<tr>
				<td>Id</td>
				<td>id</td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Age</td>
			    <td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>Password</td>
			    <td><input type="text" name="password"></td>
			</tr>
		<tr><td/><td><input type="submit" value="Update"></td></tr>
		</table>
</form>

</body>
</html>