<%@ page contentType="text/html; charset=UTF-8" language="java"
	errorPage=""%>
<script>
	window.location.href = 'index.jsp';
</script>
<%
	// 	session.invalidate();
	out.println("<script>window.location.href='index.jsp';< /script>");
%>