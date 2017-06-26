<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>可以直接通过名称访问作用域范围内的属性</title>
</head>
<body>
	获取application设置的属性app01：
	<br> ${ app01}
	<br>获取session设置的属性sess01
	<br>${sess01 }
	<br> 通过application获取session设置的属性sess01:
	<br>${application.sess01 }
</body>
</html>