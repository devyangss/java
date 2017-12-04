package com.cn.java.object.reflection;

import java.lang.reflect.Constructor;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> cls = null;
		try {
			cls = Class.forName("com.java.object.reflection.Animal");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// getConstructors 获取此Class对象所表示的类的所有公共构造方法。
		Constructor<?>[] constructors = cls.getConstructors();
		System.out.println("所有公用的构造方法：");
		for (int i=0; i<constructors.length; i++) {
			// toGenericString方法，返回描述次constructor的字符串。
			System.out.println(constructors[i].toGenericString());
		}
		
		// getConstructor 获取此Class对象所表示的类指定参数类型的公共构造方法。
		try {
			Constructor<?> constructor = cls.getConstructor(new Class[]{String.class, int.class});
			System.out.println("指定参数类型的公用构造方法：");
			System.out.println(constructor.toGenericString());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 获取此Class对象所表示的类指定参数类型的公共构造方法，不受访问级别限制
		try {
			Constructor<?> constructor1 = cls.getDeclaredConstructor(new Class[]{String.class});
			System.out.println("指定参数类型的构造方法：");
			System.out.println(constructor1.toGenericString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 获取此Class对象所表示的所有构造方法，不受访问级别限制。
		Constructor<?>[] constructors1 = cls.getDeclaredConstructors();
		System.out.println("所有的构造方法：");
		for (int j=0; j<constructors1.length; j++) {
			System.out.println(constructors1[j].toGenericString());
		}
		

	}

}
