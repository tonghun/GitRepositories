<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>用户注册</h2>
	<s:form action="userAction01" method="post">
		<s:textfield name="name" label="用户名" required="true"
			requiredposition="left"></s:textfield>
		<s:password name="password" label="密码" required="true"
			requiredposition="left"></s:password>
		<s:radio name="sex" list="#{1:'男',2:'女'}" required="true"
			requiredposition="left" label="性别"></s:radio>
		<s:select name="province" list="{'请选择省份','河南'}" label="省份"></s:select>
		<s:checkboxlist name="hobby" list="{'足球','羽毛球'}" label="爱好"></s:checkboxlist>
		<s:textarea name="description" cols="30" rows="5" label="描述"></s:textarea>
		<s:submit value="注册"></s:submit>
		<s:reset value="重置"></s:reset>
	</s:form>
</body>
</html>