<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UploadImages</title>
</head>
<body>
<form action="UploadServlet" method="POST" enctype="multipart/form-data">
	<input type="file" name="pic">
	<input type="submit" value="上传图片">
</form>
</body>
</html>