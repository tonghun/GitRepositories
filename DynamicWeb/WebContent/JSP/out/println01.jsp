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
			out.print("使用print()向浏览器输出内容/");
			out.println("使用println()向浏览器输出内容");
			out.println("第一行");
		%>	
	</pre>
	利用java代码获取缓冲区大小
	<br><%=out.getBufferSize()%>
	<br>测试是否可以通过EL获取缓冲区大小(不可以直接通过对象.去除get的方法的方式访问相应的属性，因为作用域未定义该属性)：
	<br>${pageContext.out.bufferSize }
</body>
</html>