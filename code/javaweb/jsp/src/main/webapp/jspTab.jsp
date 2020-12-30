<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020/12/30
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--
JSP标签的include，用于引用公共头部、尾部等页面。
与使用 include指令达成的显示效果一样 <%@ include file=" "%>
但是JSP标签的引用，本质上还是三个页面拼接成一个完整的页面。而include指令本质是把公共页面的代码复制到主体页面，变成一个页面
--%>

<%--<jsp:include page="common/header.jsp"></jsp:include>--%>


<%--forward，页面跳转，还可以使用 param传递参数。
    最终实现效果与 http://localhost:8080/test.jsp?name=abc&age=12 一样
--%>
<jsp:forward page="test.jsp">
    <jsp:param name="name" value="abc"/>
    <jsp:param name="age" value="12"/>
</jsp:forward>
</body>
</html>
