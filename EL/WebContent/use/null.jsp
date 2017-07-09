<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>当属性不存在时，EL返回空字符串，不是null</title>
</head>
<body>
	<c:set var="name" value="chen" scope="request"></c:set>
	<div>属性存在：${name }</div>
	<div>属性不存在存在：${age }</div>
	<div style="color: red; margin: 15px 0px">使用EL访问某一属性，如果该属性不存在，输出空字符串，而不是null</div>
	<%
		out.write("整个jsp页面都是响应内容");
	%>
</body>
</html>