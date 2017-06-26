<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试编码方式、EL隐含对象的使用范围</title>
</head>
<body>
	中国 ${pageContext.request.contextPath}
	<ol>
		<li>EL表达式中，访问作用范围的隐含对象只能用来访问作用域范围内的属性，不能用来进行其他操作；</li>
		<li>El表达式中，访问页面上下文的隐含对象pageContext，通过该对象可以访问其他隐含对象，取得其他对象以后，<br>
			可以修改被取得对象的get访问，以取得属性值的方式进行与get方法同等效果的操作;
		</li>
		<li>JSP页面指令标识中的pageEncoding用来指定JSP文件的编码方式，不直接影响页面的显示，只有在不支持中文时导致乱码才影响页面显示；<br>
			contentType用来指定JSP反馈给浏览器的内容的编码方式，浏览器直接依照该指定显示页面。
		</li>
	</ol>
</body>
</html>