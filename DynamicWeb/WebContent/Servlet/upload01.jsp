<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Servlet3.0实现文件上传。上传文件时客户端一方的设置：数据编码方式enctype="multipart/form-data"数据传输方式method="post"</title>
</head>

<body>
	<fieldset>
		<legend> 上传单个文件 </legend>
		<form action="${pageContext.request.contextPath}/UploadServlet"
			method="post" enctype="multipart/form-data">
			上传文件： <input type="file" name="file"> <br> <input
				type="submit" value="上传">
		</form>
	</fieldset>
	<hr />
	<fieldset>
		<legend> 上传多个文件 </legend>
		<form action="${pageContext.request.contextPath}/UploadServlet"
			method="post" enctype="multipart/form-data">
			上传文件： <input type="file" name="file1"> <br> 上传文件： <input
				type="file" name="file2"> <br> <input type="submit"
				value="上传">
		</form>
	</fieldset>
</body>
</html>