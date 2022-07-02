<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ChooseBook</title>
</head>
<body>
<form action="ShoppingCarServlet" method="POST">
	<p><input type="checkbox" name="book" value="javaweb程序设计"> java web程序设计</p>
	<p><input type="checkbox" name="book" value="java程序设计">java程序设计</p>
	<p><input type="checkbox" name="book" value="c++程序设计">c++程序设计</p>
	<p><input type="checkbox" name="book" value="php程序设计">php程序设计</p>
	<input type="submit" value="提交">
</form>
</body>
</html>