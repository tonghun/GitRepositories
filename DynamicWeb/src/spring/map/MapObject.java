package spring.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapObject {
	private Map<String, String> map;

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void showMap() {
		Set<String> set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
