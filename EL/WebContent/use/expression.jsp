<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn"uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
span {
	color: red;
}
</style>
<title>EL表达式中常用运算</title>
<%
	List<String> list = new ArrayList<String>();
	list.add("str01");
	list.add("str02");
	request.setAttribute("list", list);
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("key01", "value01");
	map.put("key02", "value02");
	request.setAttribute("map", map);
%>
</head>
<body>
	<c:set var="name" value="chen" scope="request"></c:set>
	<h3>EL中常用运算</h3>
	<ol>
		<li>\${empty name }判断是否存在，存在true，不存在false：<span>name存在${empty name }---age不存在${empty age }</span></li>
		<li>\${not empty name }判断是否存在，存在为false，不存在为true：<span>name存在${not empty name }</span></li>
		<li>根据索引访问List集合:<span>${list[0] }</span></li>
		<li>根据key访问Map集合：<span>${map.key01 }</span></li>
		<li>jstl遍历Map集合：<c:forEach items="${map }" var="entry">
				<span>${entry.key }=${entry.value }&nbsp;&nbsp;</span>
			</c:forEach></li>
		<li>EL表达式中的+只能用作算术运算，将参与运算的字符串转化为数字：<span>${3+"9" }</span></li>
		<li>关系运算：<span>${3>9 }</span></li>
		<li>逻辑运算：<span>${(not empty name)||(3>9) }</span></li>
		<li>条件运算：<span>${empty name?"为空":"非空" }</span></li>
	</ol>
</body>
</html>