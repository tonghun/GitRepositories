<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function checkNull(form)
	{
		for (var i = 0; i < form.length; i++) {
			if (form.elements[i].value == "") {
				alert( form.elements[i].name+"不能为空");
				form.elements[i].focus();
				return;
			}
		}
	}
</script>
</head>
<body>
	<%
		String message01 = (String) session.getAttribute("message01");
		if (message01 != null)
			out.println(message01);
	%>
	<hr>
	<form name="form" action="deal.jsp" method="post"
		onsubmit="checkNull(form)">
		留&nbsp;言&nbsp;人：&nbsp;&nbsp;&nbsp;<input name="author" type="text"><br>
		留言内容：
		<textarea name="content" cols="70" rows="10"></textarea>
		<br> <input type="submit" value="留言">&nbsp;<input
			type="reset" value="清空">
	</form>
</body>
</html>