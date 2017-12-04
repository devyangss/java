package com.cn.java.object.reflection;

public class ClassTest {
	public static void main(String[] args) {
		// Class<?>  表示类的类型未知。
		Class<?> cls = null;
		Class<?> cls1 = null;
		Class<?> cls2 = null;
		Class<?> cls3 = null;
		Animal anm = new Animal();
		// 第一种方式：使用getClass方法，生成Class类对象
		cls = anm.getClass();
		System.out.println(cls.getName());
		// 第二种方式：使用forName方法，生成Class类对象，常用。
		try {
			cls1 = Class.forName("com.java.object.reflection.Animal");
			// getName获取Class类对象所表示的实体的名称。
			System.out.println(cls1.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// 第三种方式：使用.calss语法，生成Class类对象
		cls2 = Animal.class;
		System.out.println(cls2.getName());
		
		// 第四种方式：如果是java的封装类型，使用type语法，生成Class类对象
		cls3 = String.class;
		System.out.println(cls3.getName());
	}
}
