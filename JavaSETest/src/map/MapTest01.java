package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		String key01 = new String("key01");
		String value01 = new String("value01");
		map.put(key01, value01);
		String s = map.get("key01");
		System.out.println(s);
	}

}
