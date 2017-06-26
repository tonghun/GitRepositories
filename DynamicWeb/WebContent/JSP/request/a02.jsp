<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通过cookie保存并读取用户登陆信息
1.</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		String user = "";
		String date = "";
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("myCookie")) {
					user = URLDecoder.decode(cookies[i].getValue().split("#")[0], "utf-8");
					date = cookies[i].getValue().split("#")[i];
				}
			}
		}
		if ("".equals(user) && "".equals(date)) {
	%>
	游客你好，欢迎初次光临！
	<form action="b02.jsp">
		请输入姓名：<input type="text" value="" name="user"> <input
			type="submit" value="确定">
	</form>
	<%
		} else {
	%>
	欢迎[
	<b><%=user%></b>]再次光临
	<br> 你注册的时间是：<%=date%>
	<%
		}
	%>
</body>
</html>