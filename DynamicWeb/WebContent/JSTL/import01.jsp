<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="margin: 0px;">
	<c:set var="typeName"
		value="流行金曲 | 经典老歌 | 热舞DJ | 欧美金曲 | 少儿歌曲 | 轻音乐 | 最新上榜" />
	<c:import url="import01-01.jsp" charEncoding="UTF-8">
		<c:param name="typeList" value="${typeName }" />
	</c:import>
</body>
</html>