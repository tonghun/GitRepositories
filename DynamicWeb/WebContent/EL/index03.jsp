<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册页面</title>
<script>
	function checkNull(form) {
		with (form) {
			if (name.value == "") {
				alert("用户名不能为空");
				return false;
			}
			if (password.value == "") {
				alert("密码不能为空");
				return false;
			}
		}
	}
</script>
</head>
<body>
	<form action="deal03.jsp" method="post"
		onsubmit=" return checkNull(this)">
		<table align="center" width="300" border="0">
			<tr>
				<td align="center" colspan="2"><h2 >用户注册</h2>
					<hr color="red"></td>
			</tr>
			<tr>
				<td align="right">用户名：</td>
				<td align="left"><input type="text" name="name"></td>
			</tr>
			<tr>
				<td align="right">密 码：</td>
				<td><input align="left" name="password" type="text"></td>
			</tr>
			<tr>
				<td align="right">Email：</td>
				<td align="left"><input name="email" type="text"></td>
			</tr>
			<tr>
				<td align="right">性别：</td>
				<td align="center"><input name="sex" type="radio"
					checked="checked" value="男">男&nbsp;<input name="sex"
					type="radio" value="女">女</td>
			</tr>
			<tr>
				<td align="right">爱好：</td>
				<td align="left"><input type="checkbox" name="like"
					value="登山">登山<input type="checkbox" name="like"
					value="打羽毛球">羽毛球<input type="checkbox" name="like"
					value="游泳">游泳</td>
			</tr>
			<tr>
				<td align="right">备注：</td>
				<td><textarea name="remark" cols="20" rows="5"></textarea></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="注册"></td>
			</tr>
		</table>
	</form>

</body>
</html>