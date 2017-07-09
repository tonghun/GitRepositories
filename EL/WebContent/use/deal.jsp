<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="com.el.beans.User"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
span {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("req_attr01", "req_value01");
	Cookie cookie = new Cookie("cookie_name", "cookie_value");
	response.addCookie(cookie);
%>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<title>测试EL使用</title>
</head>
<body>
	<ol>
		<li>禁用EL：<span>\${ }</span></li>
		<li>访问对象，通常为javabean对象：<span>${user.name }</span></li>
		<li>访问作用域范围的属性：<span>${req_attr01 }</span></li>
		<li>访问请求参数：<span>${param.name }</span></li>
		<li>输出字面值：<span>${"字面值" }</span></li>
		<li>判断对象是否为null：<span>${empty obj }</span></li>
		<li>算术运算：<span>${1+2 }</span></li>
		<li>关系运算：<span>${1 gt 2 }</span></li>
		<li>逻辑运算：<span>${!(1==2) }</span></li>
		<li>条件运算：<span>${empty obj?"空":"非空" }</span></li>
		<li>通过名称获取Cookie对象：<span>${cookie.cookie_name }</span></li>
		<li>访问环境信息：<span>${header.connection }</span></li>
		<li>访问属性:<span>${user.temp }</span></li>
		<li>不可以访问成员变量与静态变量：<span>\${user.ps02 }</span></li>
		<li>访问静态方法：<span>${user.doit01() }</span></li>
		<li>访问成员方法：<span>${user.doit02() }</span></li>
	</ol>
</body>
</html>