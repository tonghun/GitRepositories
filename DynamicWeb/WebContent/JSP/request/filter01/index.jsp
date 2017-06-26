<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>解决在处理请求的一端接收中文数据时出现乱码问题</title>
</head>
<body>
	<%
		session.setAttribute("content01", "content01的值");
	%>
	<%-- 	<c:redirect url="deal.jsp"> --%>
	<%-- 		<c:param name="param01" value="param01的值" /> --%>
	<%-- 	</c:redirect> --%>
	<form name="form01" action="deal.jsp" method="post" target="_blank">
		请输入中文字符：<input type="text" name="text01" id="text01" value="text01的值" /><input
			type="submit" value="提交" />
	</form>
</body>
</html>