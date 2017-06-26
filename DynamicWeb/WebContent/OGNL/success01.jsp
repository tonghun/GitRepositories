<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h2>操作普通属性</h2>
		属性name值：
		<s:property value="name" />
		<br> 学号：
		<s:property value="student['id']" />
		<br> 姓名：
		<s:property value="student.name" />
		<br> say()方法：
		<s:property value="student.say()" />
		<hr>
		request中的info的值：
		<s:property value="#request.info" />
		<hr>
		数组的长度：
		<s:property value="arr.length" />
		<br> 数组arr中的第一个元素：
		<s:property value="arr[0]" />
		<hr>
		property标签：
		<s:property value="value的值" />
		<br>set标签：
		<s:set var="param1" value="set标签中param的值" scope="request" />
		<s:property value="#request.param1" />
	</div>
</body>
</html>