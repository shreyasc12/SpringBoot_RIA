<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Details</h1>
<%
String name = (String)request.getAttribute("name");
String userid = (String)request.getAttribute("userid");
String password = (String)request.getAttribute("password");
int id = (Integer)request.getAttribute("id");
int salary = (Integer)request.getAttribute("salary");
%>

<h2>Fullname - <% out.println(name); %></h2>
<h2>Userid -<% out.println(userid); %></h2>
<h2>Password - <% out.println(password);%></h2>
<h2>salary - <% out.println(salary);%></h2>
<h2>id - <% out.println(id);%></h2>




</body>
</html>