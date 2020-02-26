package com.daiinfo.oop.inherit;

/**
 * Student类继承了Person类的属性和方法
 * 可以拥有自己的方法study
 * @author Daiyuanq
 * 
 */
public class Student extends Person {
	
	/**
	 * 构造学生类
	 * @param name
	 */
	public Student(String name){
		super(name);//调用父类的构造方法
	}
	
	// 可以拥有自己的方法study
	void study() {
		System.out.println(toString() + "   学习中 ......");
	}
}
