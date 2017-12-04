package com.cn.java.util.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapTest {
	/**
	 * 有序的
	 * 键和值都可以为null
	 * 键不可以重复
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();
		map.put(1, "Hello");
		map.put("1", "Hello World");
		map.put("1", "Hello");
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
