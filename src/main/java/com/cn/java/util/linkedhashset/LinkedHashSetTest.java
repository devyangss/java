package com.cn.java.util.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	/**
	 * LinkedHashSet 离散结构-链表
	 * 无重复元素
	 * 允许null值
	 * 有序
	 * 线程不安全（不同步）
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add("hello");
		set.add("windows");
		set.add("admin");
		set.add("hello");	// 不允许添加重复元素
		set.add("root");
		set.add(null);
		Iterator<Object> itr = set.iterator();
		// 遍历的结果是有序的。
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
