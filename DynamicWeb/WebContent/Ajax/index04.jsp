<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	var http_request;

	function handler() {
		var text = document.getElementById("text01");
		var content = text.value;
		// 		alert(content);

		if (window.XMLHttpRequest) {
			http_request = new XMLHttpRequest();
		} else {
			http_request = new ActiveXObject("Microsoft.XMLHTTP");
		}

		http_request.onreadystatechange = deal;
		http_request.open("GET", "/DynamicWeb/AjaxServlet01?param=" + content
				+ "&nocache=" + new Date().getTime(), true);
		http_request.send(null);
		// 		alert(4);
	}

	function deal() {
		if (http_request.readyState == 4 && http_request.status == 200) {
			var span01 = document.getElementById("span01");
			var res = http_request.responseText;
			alert(res);
			span01.innerHTML = res;
			alert("innerHTML---" + span01.innerHTML);
		}
	}
</script>
</head>
<body>
	<input type="text" id="text01" name="text01">
	<button type="button" onclick="handler()">处理</button>
	<br> 处理结果（加长）：
	<span id="span01"></span>
	<br>
	<form action="http://localhost:8080/DynamicWeb/AjaxServlet01">
		<input type="submit" value="提交">
	</form>
</body>
</html>