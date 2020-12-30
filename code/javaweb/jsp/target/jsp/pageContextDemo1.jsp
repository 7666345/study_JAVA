<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020/12/30
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--jsp代码段中的代码会直接以java格式输出，所以要严格按照java语法书写。--%>
<%
    pageContext.setAttribute("name1","Andy1");  //pageContext保存的数据，只在当前页面有效。
    request.setAttribute("name2","Andy2");  //request保存的数据，只在一次请求中有效。如果请求被转发，数据也会被携带过去。
    session.setAttribute("name3","Andy3");  //session保存的数据，在本次会话中有效，会话结束（关闭浏览器）后失效。
    application.setAttribute("name4","Andy4");  //application保存的数据在服务器重启前一直有效。
%>

<%--因为JVM的双亲委派机制存在，系统会根据作用域一级一级向上寻找。
所以，可以用作用域最低的pageContext来findAttribute到全部设置的数据。
设置的数据类型是String，但是取得的数据是object类型，所以需要强制转换。
--%>
<%
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");
%>

<%
    //如果请求转发，那么 request保存的参数将会被携带过去。
    pageContext.forward("pageContextDemo3.jsp");
%>

<h1>取出的数据如下：</h1>

<h4>1: <%=name1%></h4>

<h4>2: <%=name2%></h4>

<h4>3: <%=name3%></h4>

<h4>4: <%=name4%></h4>

<%--name5并未设置值，所以取出的应为String类型的默认值:null。
    使用 《%=  》表达式的时候，会显示出 null
--%>
<h4>5: <%=name5%></h4>


<%--如果使用 EL表达式：  ${} 形式，则会自动过滤掉null，不予显示。
    EL表达式 ${} 等价于 JSP表达式的 <%= %>
--%>

<h4>EL5: ${name5}</h4>


</body>
</html>
