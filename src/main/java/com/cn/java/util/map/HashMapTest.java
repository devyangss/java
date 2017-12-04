package com.cn.java.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
	/**
	 * 无序的
	 * 键和值都可以为null
	 * 键不可以重复
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		map.put(1, "Hello");
		map.put("1", "Hello World");
		map.put("key", "value");
		map.put("Hello", 2);
		map.put(null, "shanxi");
		map.put("beijing", null);
		
		// 把键值取出来
		Set<Object> keys = map.keySet();
		Iterator<Object> itr = keys.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj + "=>" + map.get(obj));
		}
	}
}
