<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2019/5/19
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/user/login" >
    用户名：<input type="text" name="name"/><br/>
    密码：<input type="text" name="pwd"/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>