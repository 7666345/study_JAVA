<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020/12/29
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--JS表达式--%>
<%--<%= 表达式或变量%>的形式，可以直接在页面输出java代码--%>
<%= new java.util.Date()%>

<hr>

<%--还可以直接用 <% %>包裹一段java代码在页面中执行--%>
<%
    int sum=0;
    for (int i = 0; i < 5; i++) {
        sum+=1;
    }

    out.println("<h3>"+ sum +"</h3>");
%>

<hr>

<%--还可以在java代码片段中嵌入html代码--%>
<table border="1">
    <tr>

        <%
            for (int i = 0; i < 5; i++) {
        %>

        <td> 这是tr的第 <%= i+1 %> 列。</td>

        <%  }  %>
    </tr>
</table>



<%--在jsp中也可以声明变量或者方法。 在这里声明的，编译后，不会放到 jspService方法中去，而是放在编译后的java类里面，作用域更高。--%>
<%!
    int age;

    private void toAdd(){
    System.out.println("在页面中声明一个方法。");
}%>

</body>
</html>
