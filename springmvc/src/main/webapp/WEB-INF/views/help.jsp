<%@ page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is help page</title>
</head>
<body>
    
    <%
      /*  String name = (String)request.getAttribute("name");
       Integer rollnumber = (Integer)request.getAttribute("rollnumber");
       LocalDateTime time = (LocalDateTime)request.getAttribute("time")
      */

    %>

   <h1>Hello My name is
    <%-- <%=name %> --%>
   ${name }
   </h1>
   <h1>This  is help page</h1>
   <h1>My rollnumber is <%--<%= rollnumber %> --%>
   ${rollnumber }
   </h1>
   
   <h1>
      Date and Time is
      <%-- <%=time.toString() --%>
      ${time }
   </h1>
   <hr>
   <c:forEach var="item" items="${marks }">
    
    <h1>${item }</h1>
   
   </c:forEach>
   
</body>
</html>