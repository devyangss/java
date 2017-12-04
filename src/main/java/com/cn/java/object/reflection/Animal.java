package com.cn.java.object.reflection;

public class Animal {
	public int weight; // 体重
	public String name; // 名称
	
	public Animal() {
		
	}
	
	public Animal(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	Animal(String name) {
		this.name = name;
	}
	
	@SuppressWarnings("unused")
	private Animal(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "动物的名称是：" + this.getName() + "，动物的体重为：" + this.getWeight();
		return str;
	}
	
	
	
	
}
