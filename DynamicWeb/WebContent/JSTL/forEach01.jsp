<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<String> list = new ArrayList<String>();
		list.add("简单是可靠的先决条件");
		list.add("兴趣是最好的老师");
		list.add("知识上的投资总能得到最好的汇报");
		request.setAttribute("list", list);
	%>
</body>
<b>遍历List集合中的全部元素：</b>
<br>
<c:forEach items="${list }" var="x" varStatus="status">
${status.index}&nbsp;${x }<br>
</c:forEach>
<b>遍历List集合中第一个元素以后的元素：</b>
<br>
<c:forEach items="${list }" var="x" varStatus="status" begin="1">
${status.index}&nbsp;${x }<br>
</c:forEach>
</html>