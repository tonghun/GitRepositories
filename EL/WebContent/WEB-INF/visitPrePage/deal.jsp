<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试EL表达式可以访问发请求的资源中的属性</title>
<style>
span {
	color: red;
	font-size:25px;
}
</style>
<%-- <jsp:forward page="/WEB-INF/visitPrePage/deal02.jsp" /> --%>
</head>
<body>
	<span>EL表达式无法访问请求资源中的属性，只能访问当前JSP页面中对象的属性与方法。</span>
	<br> name=${student.getName() }
	<br> age=${param.age }
</body>
</html>