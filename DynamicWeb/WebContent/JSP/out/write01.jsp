<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<pre>
	<%
		out.write("使用write输入到页面\n");
		out.println("使用println输入到页面");
	%>
	</pre>
	<form>
		<input type="file" name="file01" id="file01" value="搜索" />
	</form>
	<%
		out.print("使用print输入到页面");
	%>
</body>
</html>