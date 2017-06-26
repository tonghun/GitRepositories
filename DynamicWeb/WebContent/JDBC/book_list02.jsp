<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jdbc.Book"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全部图书信息</title>
<script>
	function checkNull(form) {
		with (form) {		
			if(bookCount.value==""){
				alert("请输入参数");
				return;
			}
			if (isNaN(bookCount.value)) {
				alert("输入无效")
				return;
			}
			return;
		}
	}
</script>
</head>
<body>
	<table align="center" width="500" border="1">
		<tr align="center">
			<td colspan="6"><h2>全部图书信息</h2></td>
		</tr>
		<tr align="center">
			<td><b>ID</b></td>
			<td><b>图书名称</b></td>
			<td><b>价格</b></td>
			<td><b>数量</b></td>
			<td><b>作者</b></td>
			<td><b>修改数量</b></td>
		</tr>

		<%
			List<Book> list = (List<Book>) request.getAttribute("list");
			if (list == null || list.size() < 1) {
				out.println("没有数据");
			} else {
				for (Book book : list) {
		%>
		<tr align="center">
			<td><%=book.getId()%></td>
			<td><%=book.getName()%></td>
			<td><%=book.getPrice()%></td>
			<td><%=book.getBookCount()%></td>
			<td><%=book.getAuthor()%></td>
			<td><form action="/DynamicWeb/UpdateServlet" method="get"
					onsubmit=" return checkNull(this)">
					<input type="hidden" name="id" value="<%=book.getId()%>"> <input
						type="text" name="bookCount" size="3"><input type="submit"
						value="修改">
				</form></td>
		</tr>
		<%
			}
			}
		%>
	</table>
</body>
</html>