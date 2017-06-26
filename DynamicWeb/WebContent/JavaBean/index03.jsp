<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="student" class="javaBean.Student01"></jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	学生信息
	<br>
	<div>
		<ul>
			<li>姓名：<jsp:getProperty property="name" name="student" />
			<li>姓名：<jsp:getProperty property="age" name="student" />
			<li>性别：<jsp:getProperty property="sex" name="student" />
			<li>性别：<jsp:getProperty property="homeAdd" name="student" />
		</ul>
	</div>
</body>
</html>