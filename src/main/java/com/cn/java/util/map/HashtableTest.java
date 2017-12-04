package com.cn.java.util.map;

import java.util.Iterator;
import java.util.Hashtable;
import java.util.Set;

public class HashtableTest {
	/**
	 * 有序的
	 * 键和值都不可以为null
	 * 键不可以重复
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<Object, Object> map = new Hashtable<Object, Object>();
		map.put(1, "Hello");
		map.put("1", "Hello World");
		map.put("1", "Hello");
		map.put("key", "value");
		map.put("Hello", 2);
//		map.put(null, "shanxi");	// 键值不可以为null
//		map.put("beijing", null);	// 值不可以为null
		
		// 把键值取出来
		Set<Object> keys = map.keySet();
		Iterator<Object> itr = keys.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj + "=>" +map.get(obj));
		}
	}
}
