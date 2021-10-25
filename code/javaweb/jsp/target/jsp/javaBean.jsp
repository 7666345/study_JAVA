<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2021/6/29
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--
jsp:useBean 等效于在 <%%>中new java类
--%>

<jsp:useBean id="student"  class="com.twxiao.pojo.student" scope="page" />

<%--set--%>
<jsp:setProperty name="student" property="id" value="1" />
<jsp:setProperty name="student" property="name" value="小明" />
<jsp:setProperty name="student" property="age" value="10" />
<jsp:setProperty name="student" property="address" value="北京" />

<%--get--%>
ID: <jsp:getProperty name="student" property="id" />
姓名：<jsp:getProperty name="student" property="name" />
年龄：<jsp:getProperty name="student" property="age" />
地址：<jsp:getProperty name="student" property="address" />
</body>
</html>
