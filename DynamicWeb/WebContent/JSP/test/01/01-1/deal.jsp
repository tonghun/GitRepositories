<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("UTF-8");
	String user = (String) request.getParameter("user");
	String password = (String) request.getParameter("password");
	if ("陈".equals(user) && "123".equals(password)) {
		out.println("<script>alert('登陆成功');window.location.href='index.jsp'</script>");
	} else {
		response.sendRedirect("error.jsp");
	}
%>