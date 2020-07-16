package com.bit.day07.prob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {
	public static void main(String[] args) {
		mapIteration();
	}

	public static void mapIteration() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key01", "value01");
		map.put("key02", "value02");
		map.put("key03", "value03");
		map.put("key04", "value04");

		// 1. entrySet()
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}

		// 2. keySet()
		for (String key : map.keySet()) {
			String value = map.get(key);
			System.out.println("keySet() key : " + key + ", value : " + value);
		}

		// 3. entrySet().iterator()
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println("iterator : " + itr.next()); // "key04=value04" 의 형식으로 저장
//			Entry<String,String> e = itr.next(); // e는 Set<> 타입?
//			String key = e.getKey();
//			String value = e.getValue();
		}
		
		// 4. keySet().iterator()
		Iterator<String> itrr = map.keySet().iterator();
		while(itrr.hasNext()) {
			String key = itrr.next();
			String value = map.get(key);
			System.out.println(key  +", " + value);
		}
		
		
	}	
}
