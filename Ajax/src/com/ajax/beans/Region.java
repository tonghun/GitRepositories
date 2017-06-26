package com.ajax.beans;

import java.util.HashMap;
import java.util.Map;

public class Region {
	public static Map<String, String> getRegion() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("zhejiang", "杭州,宁波,温州,丽水,金华");
		map.put("henan", "郑州,周口,驻马店,洛阳");
		return map;
	}
}
