<%@ page import="java.util.Date" %>
<%@ page errorPage="error/500.jsp" %>
<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020/12/29
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= new Date()%>

<%
 int i=1/0;
%>
</body>
</html>
