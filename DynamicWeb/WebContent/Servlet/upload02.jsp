<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传文件</title>
</head>
<body>
	<form name="form"
		action="${pageContext.request.contextPath }/UploadServlet01"
		method="post" enctype="multipart/form-data">
		<fieldset>
			<legend>文件上传</legend>
			<input type="file" name="file" id="file01" /><input type="submit"
				value="上传" />
		</fieldset>
	</form>
	<%=request.getRequestURI()%>
</body>
</html>