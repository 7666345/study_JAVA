<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020/12/23
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jsp中获取当前项目的路径，固定格式。--%>
<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="text" name="username"><br>
    <input type="text" name="pwd"><br>
    <input type="checkbox" name="hobbys" value="游戏">游戏
    <input type="checkbox" name="hobbys" value="电影">电影
    <input type="checkbox" name="hobbys" value="音乐">音乐
    <input type="checkbox" name="hobbys" value="骑行">骑行
    <br>
    <input type="submit">

</form>

</body>
</html>
