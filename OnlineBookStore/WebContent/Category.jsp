<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Category</title>
<link rel ="stylesheet" type="text/css" href="button.css">
 <style>
a:link, a:visited {
  background-color: #00FF00;
  color: Black;
  padding: 25px 35px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: red;
}
</style> 
</head>
<body background="bookpic1.jpg">
<div class ="container">


<form method="post" action="Category">
<button class="button" value="Computer" name="button">Computer</button>
<button class="button" value="BigData" name="button">Big Data</button>
<button class="button" value="Math" name="button">Math</button>
</form>
<form method="post" action="showCart">
<button class="buttons" value="Cart" style ="top:-250px; right:-800px;">CART</button>
</form>
</div>
</body>
</html>