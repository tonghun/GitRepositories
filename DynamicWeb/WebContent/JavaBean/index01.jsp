<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="produce" class="javaBean.Produce01"></jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<ul>
			<li>商品名称：<jsp:getProperty property="name" name="produce" />
			<li>价格：<jsp:getProperty property="price" name="produce" />
			<li>数量：<jsp:getProperty property="count" name="produce" />
			<li>厂址：<jsp:getProperty property="factoryAdd" name="produce" />
		</ul>
	</div>
</body>
</html>