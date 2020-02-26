package com.daiinfo.oop.inherit;

public class Person {
	// 父类中私有的部分，子类对象通过setXXX和getXXX进行访问。
	private String name;
	int age;
	
	public Person(){
		
	}
	
	public Person(String name){
		this.name=name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	void sleep() {
		System.out.println(toString() + "   睡觉中 ......");
	}
	
	public String toString(){
		return "name："+name+"\t"+"age:"+age+"\t";
	}
}
