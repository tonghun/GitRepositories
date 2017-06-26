<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String content = "";
	java.util.Locale locale = request.getLocale();
	if (locale.equals(java.util.Locale.US))
		content = "Welcome to America";
	if (locale.equals(java.util.Locale.CHINA))
		content = "欢迎来到中国";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request获取国际信息</title>
</head>
<body>
	<%=content%>
</body>
</html>