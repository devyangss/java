package com.cn.java.util.map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		/**
		 * 键不可以为null，值可以为null
		 * 键的数据类型必须保持一致
		 * 会进行自然排序
		 */
		TreeMap<Object, Object> map = new TreeMap<Object, Object>();
		map.put(1, "Hello");
		map.put(5, "Hello World");
		map.put(3, "Hello");
//		map.put("key", "value");	// 键的数据类型必须一致
		map.put(2, 2);
//		map.put(null, "shanxi");	// 键不可以为null
		map.put(4, null);	// 值不可以为null
		
		// 把键值取出来
		Set<Object> keys = map.keySet();
		Iterator<Object> itr = keys.iterator();
		// 遍历的结果会进行自然排序
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj + "=>" + map.get(obj));
		}
		
	}
}