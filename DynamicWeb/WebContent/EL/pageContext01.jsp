<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	服务器端口：${pageContext.request.serverPort }
	<br> 服务器为客户端定义的呈现反馈信息的方式：${pageContext.response.contentType}
	<br>缓冲区大小：${pageContext.out.bufferSize }
	<br>session在没有操作的情况下最大有效时间：${pageContext.session.maxInactiveInterval }
</body>
</html>