package com.daiinfo.oop.interfaces.animal;

public class Tiger extends Animal implements IAnimal{

	public Tiger(String name, int age) {
		// TODO Auto-generated constructor stub
		super(name, age);
		super.food="肉";
		super.eat();
		beProtected();
		beWorth();
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
	
	public  void eat(){
		System.out.println(name+"特别想吃..."+food+"!"+food+"!"+food+"!");
	}

	

}
