<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	request.setCharacterEncoding("UTF-8");
	// 	response.setCharacterEncoding("UTF-8");
	String s = request.getParameter("param0101");
	System.out.println("s:" + s);
	String sEnc = new String(s.getBytes("ISO-8859-1"), "UTF-8");
	System.out.println("sEnc:" + sEnc);
	request.setAttribute("param0101Enc", sEnc);
	String tempQueryString01 = new String(request.getQueryString().getBytes("ISO-8859-1"), "UTF-8");
	String tempQueryString02 = tempQueryString01.replace("%20", " ");
	String queryString = tempQueryString02.replace("&", "&amp;");
	System.out.println("queryString:" + queryString);
%>
</head>
<body>
	通过超链接传递的参数：
	<br>${param.param01}&nbsp;&nbsp;${requestScope.param0101Enc}
	<br>获取超链接的请求字符串：
	<br>
	<%=queryString%>
	<br>
	<br> 通过表单提交传递的参数：
	<br> ${param.param02}
	<br>通过请求转发传递的参数：
	<br>${param.param03}
	<br>测试在EL中能否直接通过请求参数的参数名访问请求参数(结果是不能):
	<br>${param01 }
	<br>测试能否访问在请求页面java代码块中定义的全局变量：
	<br>${js }
</body>
</html>