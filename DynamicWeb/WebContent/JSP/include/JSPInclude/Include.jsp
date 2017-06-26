<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>演示jsp:include用法</title>
</head>
<body>
	<c:set var="param02" value="param02的值" scope="request" />
	<%-- 	<c:out value="${param02 }" /> --%>
	<h3>包含文本文件，如.txt文件</h3>
	<jsp:include page="text01.txt" flush="true" />
	<h4>包含一个JSP文件</h4>
	<jsp:include page="included.jsp" flush="true">
		<jsp:param name="param01" value="使用JSP动作标识转发的数据" />
	</jsp:include>
	<hr style="border: 20; color: red;">
	<ol>
		<li>使用JSP包含文件动作标识时，被包含文件与包含文件分开执行，两者均执行完毕后合并，所以两者可以拥有不同的呈现方式，即contentType可以不同；</li>
		<li>当包含文件标识都是具有开始与结束标识时，必须使用参数传递标识传递参数；只使用开始标识，在开始标识结尾以"/"结束时，不需要传递参数。</li>
	</ol>
</body>
</html>