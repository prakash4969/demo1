<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body background="bookpic1.jpg" >
<form method="post" action="register" >
<table style="background-color :green;margn-left: 20px; text-align: center">
<tr style="text-align:center">
<td>First Name :</td><td><input type="text" name="fname" required></td>
</tr>
<tr style="text-align:center">
<td>Last Name :</td><td><input type="text" name="lname" required></td>
</tr>
<tr style="text-align:center">
<td>User ID :</td><td><input type="text" name="uid" placeholder="select user ID" required></td>
</tr>
<tr style="text-align:center">
<td>Password :</td><td><input type="text" name="password" placeholder="select password" required></td>
</tr>
<tr><td><input type="submit" value="Register">
</tr>
</table>

</form>

</body>
</html>