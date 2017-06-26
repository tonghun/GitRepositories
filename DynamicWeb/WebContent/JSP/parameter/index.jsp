<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>演示通过表单提交、超链接、JSP参数传递标识三种不同的方式传递请求参数</title>
<%
	String jp = new String("the value of jp");
	request.setCharacterEncoding("UTF-8");
%>
</head>
<body>
	<a
		href="deal.jsp?param01=the value of param01&param0101=the value of param0101的值">通过超链接传递参数，请求参数之间用&amp;隔开</a>
	<br>
	<form name="form01" action="deal.jsp" target="_blank" method="post">
		通过表单提交传递参数：<input type="text" name="param02" id="text01" /><input
			type="submit" value="提交" />
	</form>
	<%-- 	<jsp:forward page="deal.jsp"><jsp:param name="param03" --%>
	<%-- 			value="the value of param03" /></jsp:forward> --%>
</body>
</html>