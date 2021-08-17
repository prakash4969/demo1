<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<img src="<%= (String)session.getAttribute("image") %>" width="150px" height="150px">
<h1><%= (String)session.getAttribute("name") %></h1>
<h1><%= (float)session.getAttribute("price") %></h1>
<h1>Description of  Book</h1>
<p>Now you might look at this title and shy away, thinking that a book with <%= (String)session.getAttribute("name") %> in its title must be just for techies and computer scientists. However this book is very accessible to those with no background in computer science.

Decisions Oftentimes Have Optimal Solutions 

Today, many decisions that could be made by human beings from predicting earthquakes to interpreting languages can now be made by computer algorithms with advanced analytic capabilities. 

Everyday we make millions of decisions from selecting a life partner, to organizing your closet, to scheduling your life, to having a conversation.

However, these decisions may be imperfect due to limited experience, implicit biases, or faulty probabilistic reasoning. 

<%= (String)session.getAttribute("name") %> can better predict human behavior than trained psychologists and with much simpler criteria. Studies continue to show that the algorithms can do a better job than experts in a range of fields. 

Artificial intelligence is reshaping healthcare, science, engineering and life. The results will make our lives more productive, better organized, and essentially, much happier.

Everywhere you look, artificial intelligence is beginning to permeate all types of industries and expectations are that it will continue to grow in the future. 

Imagine The Possibilities 

More Accurate Medical Diagnoses 

Better Military Strategies That Could Save Lives

Detect Abnormal Genes In An Unborn Child 

Predict Changes In Weather and Earthquake

Safer Self-Driving Cars That Have Learned Your Personal Preferences 

Analyze DNA Samples & Identify Potential Medical Risks 

Smart Homes That Will Anticipate Your Every Needs

Predicting Where Cyber Hackers & Online Threats May Occur </p>
<div class ="container">
<form method="post" action="addToCart">
<button class="button" value="AddToCart" name="button">ADD TO CART</button>
</form>
</div>
</body>
</html>