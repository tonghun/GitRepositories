<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function createRequest() {
		req = false;
		if (window.XMLHttpRequest) {
			req = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			try {
				req = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					req = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {

				}
			}
		}

		if (!req) {
			alert("XMLHttpRequest对象未成功创建");
			return;
		}

		req.open("get", "deal01.jsp?param="
				+ document.getElementById("content").value, true);
		req.onreadystatechange = getResult;
		req.send(null);
	}

	function check() {
		var content = document.getElementById("content").value;
		if (content == "") {
			alert("输入为空，请重新输入");
			return;
		} else {
			var content = document.getElementById("content").value;
			alert(content);
		}

		createRequest();
	}

	function getResult() {
		if (req.readyState == 4) {
			if (req.status == 200) {
				document.getElementById("content").value = req.responseText;
				document.getElementById("result").innerHTML = req.responseText;
			}
		}
	}
</script>
</head>
<body>
	<form action="" method="get" name="form">
		<input name="content" type="text" id="content"><input
			type="button" value="检测" onclick="check()"> 检测结果：
		<div id="result"></div>
	</form>
</body>
</html>