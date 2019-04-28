function crerateParams(frm) {
	var params = {};
	var elements = document.getElementsByTagName("input");
	if (elements) {
		for (var i=0; i<elements.length; i++) {
			var el = elements[i];
			if (el.getAttribute("type") != "hidden") continue;
			var id = el.getAttribute("id");
			var value = el.getAttribute("value");
			if (id && value) params[id] = value;
		}
	}

	elements = document.getElementsByTagName("span");
	if (elements) {
		for (var i=0; i<elements.length; i++) {
			var el = elements[i];
			var id = el.getAttribute("id");
			var value = el.innerHTML;
			if (value) params[id] = value;
		}
	}
	return params;
}

function request(url, params) {
	var query = [];
	for (var key in params) {
		var value = params[key];
		query.push(encodeURIComponent(key)+"="+(value==null?"":encodeURIComponent(value)));
	}
	location.href = url + "?" + query.join("&");
}

function loadData() {
	if (!window.location.search) return;
	var query = window.location.search.substring(1,window.location.search.length);

	var params = query.split("&");
	var buf = [];
	for (var i=0, len=params.length; i < len; i++) {
		var c = params[i].split("=");
		var key = c.length > 0 ? decodeURIComponent(c[0]) : null;
		var value = c.length > 1 ? decodeURIComponent(c[1]) : null;
		if (value == '') value = 'No Value';
		if (key) {
			var el = document.getElementById(key);
			if (el) {
				if (el.hasAttribute("value")) {
					el.value = value;
				} else {
					el.innerHTML = value;
				}
			}
		}
	}
}
