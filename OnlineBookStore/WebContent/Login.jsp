<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<h1 >Online book store</h1>
<meta charset="ISO-8859-1">
<style>
body  {
  background-image: url("bookpic1.jpg");
  background-repeat: no-repeat;
  background-position: center;
  background-size: 1400px 1100px;
}

div {
  align-content: center;
}

</style>
</head>
<body>
<form method="post" action="Login">
<div>
<table style="background-color :red;margn-left: 20px; align: center">
<tr>
<td><b style="color:blue;">User Name :</b></td><td><input type="text" name="uname" placeholder="Enter user ID" required></td>
</tr>
<tr><td> <b style="color:blue;">password :</b></td><td><input type="password" name="password" placeholder="Enter Password" required></td>
</tr>
</table>
<input type="submit" value="LOGIN">
<a style="color:red;" href="register.jsp">REGISTER</a>
</div>
</form>
</body>
</html>