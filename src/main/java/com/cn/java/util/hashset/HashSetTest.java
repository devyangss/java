package com.cn.java.util.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	/**
	 * Set集合
	 * 无重复元素
	 * 允许null值
	 * 无序的
	 * 线程不安全的（不同步）
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set = new HashSet<Object>();
		set.add("Hello World");
		set.add(99);
		set.add(3.14);
		set.add('A');
		set.add(null);
		set.add('A');	// 不能添加重复的元素
		set.add(false);
		/*无法使用for循环遍历访问set元素
		for(int i=0; i<set.size(); i++) {
			
		}*/
		
		// 可以使用迭代器遍历每个元素
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 其他方法类似list。
	}

}
