package com.daiinfo.oop.interfaces.animal;

/**
 * 动物（Animal）具有行为：吃（eat）、睡觉（sleep） 老虎是动物，同时是有价值且受保护得动物类型。 熊猫是动物，同时是有价值且受保护得动物类型。
 * 这些动物吃的行为各不相同（熊猫吃竹子，老虎吃肉）； 但睡觉的行为是一致的； 受保护得级别不一致，价值也不一致。
 * 
 * @author Daiyuanq
 *
 */
public class Animal {
	String name;
	int age;
	String food;

	/**
	 * 构造函数
	 * 
	 * @param name
	 * @param age
	 */
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void eat() {
		System.out.println(name + "是吃" + food + "的!");
	}

	public void sleep() {
		System.out.println(name + "正在睡觉...");
	}
}
