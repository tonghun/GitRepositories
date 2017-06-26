<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL语法格式只允许嵌套同角色的数值</title>
<%
	request.setAttribute("attr01", 100);
	request.setAttribute("attr02", 2.3);
	request.setAttribute("attr03", "the value of attr03");
	request.setAttribute("attr04", "the value of attr04");
%>
</head>
<body>
	在EL中同角色只允许嵌套数值（或可被自动转化为数值），并且数字必须通过"+"连接：
	<br>${attr01+attr02 }
	<br>不允许以任何形式嵌套同角色的其他任何类型数据,因为EL默认将同角色的属性当做数值来合成：
	<br>${attr03+attr04}
</body>
</html>