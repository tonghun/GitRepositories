<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%="使用request.getContextPath()得到的内容："%><br>
	<%=request.getContextPath()%>
	<br> 请求文件的绝对路径：
	<br>
	<!--request.getRealPath()方法已过时 -->
	<%=request.getRealPath("/a01.jsp")%><br>
	<%=request.getRequestURL()%>
	<form name="form1" action="a01.jsp" method="post">
		<input type="submit" value="提交" />
	</form>
</body>
</html>