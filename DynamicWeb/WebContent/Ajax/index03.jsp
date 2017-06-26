 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="AjaxRequest01.js"></script>
<script>
	onload = function() {
		getProvince();
		// 		getCity();
	}

	function getProvince() {
		var loader = new request(
				"/DynamicWeb/ZoneServlet?action=getProvince&nocache="
						+ new Date().getTime(), dealProvince, onerror, "GET");
	}

	function dealProvince() {
		provinces = this.responseText.split(",");
		for (i = 0; i < provinces.length; i++) {
			document.getElementById("select01").options[i] = new Option(
					provinces[i], provinces[i]);
		}

		alert("provinces[0]---" + provinces[0]);

		getCity(provinces[0]);
	}

	function getCity(province) {
		alert("province" + province);
		var loader = new request(
				"/DynamicWeb/ZoneServlet?action=getCity&param=" + province
						+ "&nocache=" + new Date().getTime(), dealCity,
				onerror, "GET");
	}

	function dealCity() {
		cities = this.responseText.split(",");
		for (i = 0; i < cities.length; i++) {
			document.getElementById("select02").options[i] = new Option(
					cities[i], cities[i]);
		}
	}
	function onerror() {
	}
</script>
</head>
<body>
	请选择：
	<select id="select01" onchange="getCity(this.value)"></select>-
	<select id="select02"></select>
</body>
</html>