package com.daiinfo.oop.interfaces.animal;

public class Mouse extends Animal {
	public Mouse(String name, int age) {
		// TODO Auto-generated constructor stub
		super(name, age);
		food="残羹冷炙";
		super.eat();
		
	}


	public void eat() {
		System.out.println(name + "正在吃" + food);
	}
}
