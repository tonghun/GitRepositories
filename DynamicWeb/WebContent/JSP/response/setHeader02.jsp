<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var t01 = 5;
	function m01() {
		t01-=1;
		t.innerHTML = t01;
		setInternal("m01()",1000);
	}
</script>
</head>
<body id="t" onload="m01()">
	<%
		response.setHeader("refresh", "5;URL=destination.jsp");
	%>
</body>
</html>