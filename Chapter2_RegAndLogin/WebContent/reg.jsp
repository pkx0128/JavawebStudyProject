<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
<body>
<form action="userServlet" method="post">
	<p>用户注册</p>
	<p><input type="text" name= "username" placeholder="用户名" ></p>
	<p><input type="password" name="password" placeholder="密码"></p>
	<p><input type="password" name="cmpassword" placeholder="确认密码"></p>
	
	<p><input type="submit" name="submitBnt" value="注册"></p> 
</form>              
</body>
</html>