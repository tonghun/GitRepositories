<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>演示request设置的属性的有效范围</title>
<%
	String url = request.getRequestURL().toString();
	// 	System.out.println(requestURL);
	session.setAttribute("sessionUrl", url);
	request.setAttribute("requestUrl", url);
%>
</head>
<body>
	<form name="form01" action="deal.jsp" target="_blank">
		<input type="submit" value="提交" />
	</form>
	<jsp:forward page="deal.jsp" />
	通过java代码获取当前文件的地址request.getRequestURL:
	<br>
	<%=request.getRequestURL()%>
	<br>
	<br> 通过session对象获取：
	<!--  相当于session.getRequestURL()-->
	<br> ${sessionScope.sessionUrl}
	<br>
	<br>通过request对象获取（request对象在作用域内设置的属性可以在设置页面获取，还可以在转向的Web资源内获取）：
	<!--  -->
	<br>${requestScope.requestUrl }
</body>
</html>