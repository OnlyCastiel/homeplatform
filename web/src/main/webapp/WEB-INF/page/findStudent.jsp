<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息查询</title>
</head>
<body>
	<form action="findStudent" method="post">
		<input type="text" name="name">
		<button type="submit">查询</button>
	</form>
	<a href="findStudent">点击查询</a>
</body>
</html>