package approval.util;

import java.util.HashMap;

public class BDDCache {

	private static HashMap<String, Object> cache = new HashMap<String, Object>();

	public static Object get(String string) {
		return cache.get(string);
	}
	
	public static void put(String string, Object object) {
		cache.put(string,object);
	}

	public static void reset() {
		cache.clear();
	}
}
