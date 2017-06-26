<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示当前Session对象</title>
</head>
<body>
	<%
		HttpSession session01 = request.getSession(false);
		if (session01 != null) {
			// session01.invalidate();
			out.write(session01.toString());
		} else
			out.write("Session不存在");
		out.write("<br>");
		out.write("JSP页面有一个内置的Session对象");
	%>
</body>
</html>