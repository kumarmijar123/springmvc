 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home page</title>
</head>
<body>
   <h1>This is home page</h1>
   <h1>Called by home controller</h1>
   
   <%
     String name=(String) request.getAttribute("name");
     Integer id = (Integer) request.getAttribute("id");
     
   %>
   <h1>Name is <%=name %></h1>
   <h1>Id is <%=id %></h1>
   
   
</body>
</html>