package com.daiinfo.oop.inherit;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个实例p，赋给name和age，并输出sleep方法和study方法。
		Student p = new Student("张三");
		p.age = 18;
		p.sleep();
		p.study();
		
		// 创建一个实例s，赋给name和age，并输出sleep方法和work方法。
		Worker s = new Worker("老李",38);
		s.age = 38;
		s.sleep();
		s.work();
	}

}
