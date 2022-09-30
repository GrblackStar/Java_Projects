package upr_9;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Ivancho", 6);
		hashMap.put("Dancho", 3);
		hashMap.put("Gancho", 5);
		hashMap.put("Pancho", 4);
		hashMap.put("Dancho", 6);
		System.out.println(hashMap);
		
		//getting the value for every key
		for(String key: hashMap.keySet()) {
			Integer value = hashMap.get(key);
			System.out.println(key+"="+value);
		}

	}

}
