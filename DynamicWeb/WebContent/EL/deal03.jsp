<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		用户名：${param.name } <br> 密 码：${param.password }<br>
		邮箱：${param.email }<br> 性别：${param.sex }<br>爱好：${paramValues.like[0] }&nbsp;${paramValues.like[1] }&nbsp;${paramValues.like[2] }<br>
		备注：${param.remark }
	</center>
</body>
</html>