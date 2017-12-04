package com.cn.java.array;

public class ArrayBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.静态初始化数组
		// int[] i_array = {1, 2, 3};
		
		// 2.动态初始化数组
		// int[] i_array = new int[3];
		// i_array[0] = 1;
		// i_array[1] = 2;
		// i_array[2] = 3;
		
		// 3.静态初始化数组
		int[] i_array = new int[]{1, 2, 3};
		System.out.println(i_array[0]);
		for (int value: i_array) {
			 System.out.println(value);
		}
		
		double[] d_array = {1.56, 2.57, 3.58};
		// System.out.println(d_array[0]);
		for (int i=0; i<d_array.length; i++) {
			// System.out.println(d_array[i]);
		}
		
		// 字符串用双引号
		// 1.循环
		String[] s_array = {"aaa", "bbb", "ccc"};
		for (int i=0; i<s_array.length; i++) {
			// System.out.println(s_array[i]);
		}
		
		// 字符用单引号
		// 2.循环
		char[] c_array = {'a', 'b', 'c'};
		for (char value: c_array) {
			 System.out.println(value);
		}
		
	}

}
