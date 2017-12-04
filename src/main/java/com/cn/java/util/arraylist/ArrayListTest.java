package com.cn.java.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	/**
	 * ArrayList:线性结构-顺序结构
	 * 数据以数组形式存放，可动态存放数据。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(199);
		list.add(3.14);
		list.add(3.14);
		list.add("Hello World");
		list.add('y');
		list.add(null);
		list.add(true);
		
		System.out.println("-----ArrayList----------");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		System.out.println("-----iterator----------");
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----isEmpty----------");
		if (list.isEmpty()) {
			System.out.println("the \"list\" is empty");
		} else {
			System.out.println("the \"list\" is not empty");
		}
		
		System.out.println("-----toArray----------");
		Object[] array = list.toArray();
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("-----contains----------");
		if (list.contains(null)) {
			System.out.println("the list contains null");
		} else {
			System.out.println("the list not contains null");
		}
		
		
		System.out.println("-----clear----------");
		list.clear();
		System.out.println(list.size());
	}

}
