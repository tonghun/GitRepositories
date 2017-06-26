<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>写入注册信息</title>
</head>
<body>
	<%
		// 		request.setCharacterEncoding("GB18030");
		String user = URLEncoder.encode(request.getParameter("user"), "utf-8");
		Cookie cookie = new Cookie("myCookie", user + "#" + new java.util.Date().toString());
		cookie.setMaxAge(30 * 24 * 60 * 60);
		response.addCookie(cookie);
	%>
	<script>
// 		window.location.href = "a02.jsp"
	</script>
	<%=request.getRequestURL()%>
</body>
</html>