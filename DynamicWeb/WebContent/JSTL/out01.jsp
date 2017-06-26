<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	c:out没有标签体的语法格式：
	<c:out value="无标签体格式" />
	<br> c:out有标签体的语法格式：
	<c:out value="null">默认值</c:out>
	<br> escapeXml=true:
	<c:out value="转化特殊字符，原样显示<hr>" escapeXml="trur" />
	<br>escapeXml=falue:
	<c:out value="不转化特殊字符，当做HTML代码输出" escapeXml="false" />
</body>
</html>