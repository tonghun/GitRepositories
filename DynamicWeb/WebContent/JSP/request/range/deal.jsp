<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	// 	session.removeAttribute("sessionUrl");
%>
</head>
<body>
	由请求index触发!
	<h3 style="color: red;">request.setAttribute(String key,Object
		obj):用于向转发后的 Web资源传递数据,转发不同于请求。转发者不是事件的触发者，而是中间一个环节；请求者是事件发起者。</h3>
	<br>通过session获取requestUrl:
	<br>${sessionScope.sessionUrl}
	<br>
	<br>
	通过request获取requestUrl(通过request.getAttribute()只能获得转发而来的数据，不能获得请求参数):
	<br>${requestUrl}
	<br>
	<br>结尾！
</body>
</html>