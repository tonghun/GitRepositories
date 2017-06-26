<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@  page isELIgnored="true"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	request.setAttribute("name", "name值");
%>
</head>
<body>${"使用EL在页面中显示内容" }<br> ${4+5 }
	<br>为了区别作为EL标记的${"${"}，采用以下方法在页面中显示该标记（是作为标记，还是普通字符串）：${"${" }；
	<br> 禁用EL的方法：\${'内容被禁用' }
	<br>字符串用单引号括起来：${'单引号括起来的内容1' }
	<br>直接使用属性名获得属性值：${name }
	<br>通过访问作用域范围的隐含对象获取属性值：${requstScope.name }
</body>
</html>