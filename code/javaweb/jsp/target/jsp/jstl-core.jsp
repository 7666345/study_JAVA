<%@ page import="java.util.ArrayList" %><%--
JSTL标签库
使用JSTL标签库前，必须要在页面中引入。
--%>

<%--引入JSTL核心库（core库）--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="jstl-core.jsp" method="get">

    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="提交">
</form>

<%--使用JSTL标签判断，如果username的值是 admin，则提示管理员你好--%>

<%--EL表达式获取表单中的参数时，需要用 ${param.参数名}--%>
<c:if test="${param.username=='admin'}" var="isAdmin">
    <c:out value="管理员你好。"></c:out>
</c:if>


<%--可以使用 <c:set>标签设置一些值--%>
<%--声明一个变量叫score，值是100--%>
<c:set var="score" value="100"></c:set>

<%--使用 c:choose 和 c:when 可以做类似switch的多重判断--%>
<c:choose>
    <c:when test="${score>=90}"> 成绩优秀 </c:when>
    <c:when test="${score>=80}"> 成绩还行 </c:when>
    <c:when test="${score>=70}"> 成绩一般 </c:when>
    <c:when test="${score<=60}"> 成绩比较差 </c:when>
</c:choose>


<hr>
<%
    ArrayList<String> students = new ArrayList<>();
    students.add(0,"小明");
    students.add(1,"小红");
    students.add(2,"小黑");
    students.add(3,"小白");
    students.add(4,"小丽");
    request.setAttribute("list",students);
%>
<%--
c:forEach循环遍历：

var--循环中的变量
item---循环的数据源
bengin---从哪开始
end---到哪结束
step---每次循环的步长
--%>
<c:forEach var="student" items="${list}" begin="1" end="3" step="2">
    <c:out value="${student}"></c:out>
</c:forEach>

</body>
</html>
