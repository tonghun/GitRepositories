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
	<form action="actionTest01" method="post">
		<s:select name="city" list="{'北京','上海','深圳'}" label="城市"></s:select>
		<br>
		<s:checkboxlist name="hobby" label="爱好" list="{'羽毛球','乒乓球','台球'}"></s:checkboxlist>
		<br>
		<s:radio name="sex" label="性别" list="{'男','女'}" />
		<br>
		<s:submit value="提交"></s:submit>
	</form>
</body>
</html>