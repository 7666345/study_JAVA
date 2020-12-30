<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020/12/30
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--取出页面传递过来的参数并打印--%>
姓名：<%=request.getParameter("name")%>
年龄：<%=request.getParameter("age")%>

</body>
</html>
