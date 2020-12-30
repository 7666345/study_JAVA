<%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2020/12/30
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--因为JVM的双亲委派机制存在，系统会根据作用域一级一级向上寻找。
所以，可以用作用域最低的pageContext来findAttribute到全部设置的数据。
设置的数据类型是String，但是取得的数据是object类型，所以需要强制转换。
--%>
<%
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2"); //request保存的，请求呗转发到这里时，可以取到这个数据。
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");
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
