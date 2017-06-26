<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	此处包含一个文件&nbsp;&nbsp;<%@ include file="includedFile.txt"%><br>
	使用指令标识的包含是静态包含，被包含文件原样显示在包含文件中，底层生成一个.java文件，两者之间不能有同名的方法与变量。
	<br><%@include file="included.jsp"%>
	<button type="button">按钮</button>
</body>
</html>