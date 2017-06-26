function request(url, deal, onerror, method, params) {
	var req = false;
	if (window.XMLHttpRequest) {
		req = new XMLHttpRequest();
	} else if (widow.ActiveXObject) {
		try {
			req = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				req = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
			}
		}
	}
	req.onreadystatechange = function() {
		if (req.readyState == 4) {
			if (req.status == 200) {
				deal.call(this);
			}
		}
	}
	req.open(method, url, true);
	req.send(null);
}
