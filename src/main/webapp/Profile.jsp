<%@page import="com.ria.HelloSpringMvc.services.EmployeeDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.ria.HelloSpringMvc.services.Employee"%>
<%@page import="com.ria.HelloSpringMvc.services.Address"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
EmployeeDAO emp = new EmployeeDAO();
String userid =(String)session.getAttribute("userid");
List l = emp.showData(userid);
Employee e = (Employee)l.get(0);
Address a = e.getAddress();
//out.print(e.getName()+" "+e.getSalary()+e.getEmpid()+a.getPincode()+a.getCity());
%>

<div align="center">
<h1><u>MY PROFILE</u></h1>
<h1>Name:-<% out.print(e.getName()); %></h1>
<h1>Employee id:-<% out.print(e.getEmpid()); %></h1>
<h1>Salary:-<% out.print(e.getSalary()); %></h1>
<h1>City-<% out.print(a.getCity()); %></h1>
<h1>Pincode-<% out.print(a.getPincode()); %></h1>
</div>
</body>
</html>