<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="myFn" uri="http://java.sun.com/jsp/jstl/myFunctions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>自定义EL函数</title>
<%
	String[] str = new String[4];
	str[0] = "str01";
	str[1] = "str02";
	str[2] = "str03";
	str[3] = "str04";
	request.setAttribute("str", str);
%>
</head>
<body>
	<div>自定义函数：${myFn:length("123") }</div>
	<div>
		内置函数：
		<div>判断字符串中是否存在指定的字符：${fn:contains("abc","a") }</div>
		<div>使用指定的连接符将数组连接成字符创：${fn:join(str,"-")}</div>
	</div>
</body>
</html>