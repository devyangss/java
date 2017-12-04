package com.cn.java.util.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	/**
	 * LinkedList 线性结构：离散结构
	 * 数据以链表形式存放，可动态存放数据。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("Hello World");
		list.add('a');
		list.add(99);
		list.add(3.14);
		list.add(null);
		list.add(false);
		System.out.println("------------LinkedList-----------");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------Itetarot迭代器遍历访问------------");
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------与ArrayList的区别---");
		list.addFirst("first");	// 在list列表开头添加元素
		list.addLast("last"); // 在list列表结尾添加元素
		
		System.out.println("列表开头元素：" + list.getFirst());
		System.out.println("列表结尾元素:" + list.getLast());
		System.out.println("-------------------");
		System.out.println("pop前列表的开头元素；" + list.peek()); // 获取但并不移除列表的开头
		System.out.println(list.pop()); // 从堆栈中弹出列表的开头
		System.out.println("pop后列表的开头元素：" + list.peek());
		
		System.out.println("-------------toArray()---------");
		list.clear();
		Object[] array = list.toArray();
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
