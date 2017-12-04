package com.cn.java.object.reflection;

import java.lang.reflect.Constructor;

public class DynamicInstance {

	// 动态实例化对象
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> cls = null;
		try {
			cls = Class.forName("com.java.object.reflection.Animal");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Constructor<?> constructor = cls.getConstructor(new Class[]{String.class, int.class}); 
			try {
				Animal anm = (Animal)constructor.newInstance("小狗", 70);
				System.out.println(anm);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

	}

}
