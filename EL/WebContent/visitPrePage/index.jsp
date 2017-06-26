<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试EL表达式是否可以访问请求的资源中的属性</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/RequestServlet" method="get">
		姓名：<input type="text" name="name"><br>
		年龄：<input type="text" name="age"> <br> 
		          <input type="submit" value="提交">
	</form>
</body>
</html>