package com.cn.java.util.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	/**
	 * Set集合
	 * 无重复元素
	 * 允许null值
	 * 有序的
	 * 线程不安全的（不同步）
	 * 使用二叉树实现
	 * @param args
	 */
	public static void main (String[] args) {
		TreeSet<Object> set = new TreeSet<Object>();
		set.add("china");
		set.add("window");
		set.add("console");
		set.add("admin");
		set.add("root");
		set.add("Admin");
		
		// 字符串按照ASCII码排序了。
		Iterator<Object> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
