package com.daiinfo.oop.interfaces.animal;

public class Panda extends Animal implements IAnimal{

	public Panda(String name, int age) {
		// TODO Auto-generated constructor stub
		super(name, age);
		food="竹子";
		beProtected();
		beWorth();
		super.eat();
	}

	@Override
	public void beProtected() {
		// TODO Auto-generated method stub
		System.out.println(name+"是受保护的动物！");
	}

	@Override
	public void beWorth() {
		// TODO Auto-generated method stub
		System.out.println(name+"是有价值的动物！");
	}
	
	public void eat(){
		System.out.println(name+"正在吃"+food+"!");
	}
	
}
