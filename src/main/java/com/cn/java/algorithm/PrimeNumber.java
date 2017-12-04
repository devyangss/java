package com.cn.java.algorithm;


public class PrimeNumber {
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		int count = 0;
		for (int i=101; i<=200; i++) {
			if (obj.isPrimeNumber(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	/**
	 * 判断一个数是否为素数。
	 * 素数：只能被1或者本身整除的自然数。
	 * 自然数：大于等于0的整数。
	 * a/b，a为被除数，b为除数。
	 * 整除，被除数除以除数取余，结果为0。
	 * @param number 要判断的数
	 * @return boolean
	 */
	public boolean isPrimeNumber(int number) {
		if (number < 0) {
			return false;
		}
		
		if (number <= 3) {
			return true;
		}
		
		for (int i=2; i<number; i++) {
			if (number%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
