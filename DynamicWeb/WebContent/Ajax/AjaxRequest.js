var net = new Object();// 定义一个全局变量
net.AjaxRequest = function(url, onload, onerror, method, params) {
	this.req = null;
	this.onload = onload;
	this.onerror = (onerror) ? onerror : this.defaultError;
	this.loadDate(url, method, params);
}
net.AjaxRequest.prototype.loadDate = function(url, method, params) {
	if (!method) {
		method = "Get";
	}

	if (window.XMLHttpRequest) {
		this.req = new XMLHttpRequest();
	} else if (widow.ActiveXObject) {
		try {
			this.req = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				this.req = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {

			}
		}

		if (this.req) {
			try {
				var loader = this;
				this.req.onreadystatechange = function() {
					net.AjaxReqeust.onReadyState.call(loader);
				}
				this.req.open(method, url, true);
				if (method == "POST") {
					this.req.setResponseHeader("Content-Type",
							"application/x-www-form-urlencoded");
				}
				this.send(params);
			} catch (e) {
				this.onerror.call(this);
			}
		}
	}
}
net.AjaxRequest.onReadyState = function() {
	var req = this.req;
	var ready = req.readyState;
	if (ready == 4) {
		if (req.status == 200) {
			this.onload.call(this);
		} else {
			this.onerror.call(this);
		}
	}
}

net.AjaxRequest.prototype.defaultError = function() {
	alert("错误数据\n\n回调状态：" + this.req.readystate + "\n状态：" + this.req.status);
}