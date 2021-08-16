<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<body>
<table>
<tr><td><a href="CheckOut.jsp"><img src="<%= request.getAttribute("name2") %>" width="150px" height="150px"></a></td></tr>
<tr><td><h1><%= request.getAttribute("name1") %></h1></td></tr>
<tr><td><b><%= request.getAttribute("name3") %></b></td></tr>
<% 
session.setAttribute("image",request.getAttribute("name2"));
session.setAttribute("name",request.getAttribute("name1"));
session.setAttribute("price",request.getAttribute("name3"));
String img = (String)session.getAttribute("image");
String name = (String)session.getAttribute("name");
float price = (float)session.getAttribute("price");
%>
</table>
</body>
</html>