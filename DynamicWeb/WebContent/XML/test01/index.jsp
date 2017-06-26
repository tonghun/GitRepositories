<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<link rel="sheetstyle" href="CSS/style.css" type="text/css">
</head>
<body>
	<c:redirect url="/PlacardServlet01">
		<c:param name="action" value="query" />
	</c:redirect>
</body>
</html>