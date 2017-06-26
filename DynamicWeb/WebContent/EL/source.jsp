<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	Cookie cookie = new Cookie("cookieName", "cookieValue");
	response.addCookie(cookie);
%>
</head>
<body>
	<form action="param01.jsp" method="post">
		<input name="text01" type="text"><input type="submit"
			value="提交"><br> <input name="check" type="checkbox"
			value="checkbox01">checkbox01<input name="check"
			type="checkbox" value="checkbox02">checkbox02<input
			name="check" type="checkbox" value="checkbox03">checkbox03
	</form>
</body>
</html>