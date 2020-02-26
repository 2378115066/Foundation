package com.daiinfo.oop.inherit;

/**
 * worker类继承了Person类的属性和方法
 * 可以拥有自己的方法work
 * @author Daiyuanq
 * 
 */
public class Worker extends Person{
	
	/**
	 * 构造工人类
	 * @param name
	 * @param age
	 */
	public Worker(String name,int age){
		super(name);    //调用父类的构造方法
		this.age=age;
	}
	
	// 可以拥有自己的方法work
	void work() {
		System.out.println(toString() + "   工作中 ......");
	}
}
