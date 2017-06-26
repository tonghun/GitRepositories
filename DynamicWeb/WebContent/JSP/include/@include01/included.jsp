<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>通过该测试说明JSP底层是Servlet</title>
<%
	String name;
%>
<script>
	function myFunction() {

	}
</script>
<%!private String name;%>
</head>
<body>
	JPS文件既可以部署到WEB-INF目录下，也可以部署其中，部署其中更安全。
	<%--在JSP文件中只能使用JSP专有注释，其他注释都会被当做普通文本写入底层文件中，增加底层负担 --%>
	<!-- 这种注释是HTML的注释方式，出现在JSP中时会被当作普通文本写入.java文件中 -->
	<img src="include.jpg">
</body>
</html>