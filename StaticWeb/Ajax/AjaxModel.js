/**
 * 这是一个通用的创建Ajax框架的模型，提供了应用程序编程接口，避免重复编写大量代码
 */

function RequestObject(method, url, deal, paramString) {
	var req;
	if (window.XMLHttpRequest) {
		req = new XMLHttpRequest();
	} else {
		req = new ActiveXObject("Microsoft.XMLHTTP");
	}

	req.onreadystatechange = function() {
		alert(req.status);
		if (req.readyState == 4 && req.status == 200) {
			alert("onreadystatechange");
			deal.call(this)// 这里是关键
			alert("onreadystatechange结束");
		}
	};

	req.open(method, url, true);
	if (method == "GET")
		req.send(null);
	else if (method == "POST") {
		/* 如果数据传输方式采用post，必须单独传递参数，不能追加到URL后面，传递参数之前必须设定参数的类型，以便服务器解析 */
		req.send("Content-Type", "application/x-www-form-urlencoded");
		req.send(paramString);
	} else {
		alert("传输方法错误");
	}
}