<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:useBean id="admin" scope="page" class="com.bjsxt.jsp.Admin"/>
<jsp:setProperty name="admin" property="*"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JSP Usebean</title>
</head>
<body>
你输入的用户名和密码为：<br>
用户名：<jsp:getProperty name="admin" property="username"/><br>
密码：<jsp:getProperty name="admin" property="password"/><br>
</body>
</html>