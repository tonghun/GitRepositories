<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function check(form) {
		with (form) {
			if (title.value == "") {
				alert("标题不能为空");
				title.focus();
				return false;
			}
			if (content.value == "") {
				alert("内容不能为空");
				content.focus();
				return false;
			}
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>保存公告信息到XML文档</title>
<%
	String currentPath = request.getRequestURL().toString();
	System.out.println("currentPath:" + currentPath);
	session.setAttribute("filePath", currentPath);
%>
</head>
<body>
	<form name="form1" action="/DynamicWeb/PlacardServlet" method="post"
		target="_blank" onsubmit="return check(this)">
		<table align="center">
			<tr>
				<td colspan="2" align="center">.添加公告信息</td>
			</tr>
			<tr>
				<td>公告标题：</td>
				<td><input type="text" name="title" size="52"></td>
			</tr>
			<tr>
				<td>公告内容：</td>
				<td><textarea name="content" cols="50" rows="9"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="reset" value="重置" />&nbsp;<input
					type="submit" value="提交" />
				<td>
			</tr>
		</table>
	</form>
</body>
</html>