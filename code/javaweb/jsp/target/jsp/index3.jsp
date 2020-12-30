<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020/12/30
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--方法1，使用 @include方法引用，本质是将引用的文件代码拿过来与主体合二为一。--%>
<%@ include file="common/header.jsp"%>
<h1>网页主体</h1>
<%@ include file="common/footer.jsp"%>

<hr>

<%--方法2：jsp标签引用，真正的讲页面引用过来，不是简单地将代码复制到主体中。--%>
<jsp:include page="common/header.jsp" />
<h1>网页主体</h1>
<jsp:include page="common/footer.jsp"/>

</body>
</html>
