package com.daiinfo.oop.encapsulation;

public class Student {
	int sid;// 学号
	String sname;
	int sage;
	String ssex;

	/**
	 * 无参构造函数
	 */
	public Student() {

	}
	
	/**
	 * 有参构造函数
	 * @param id  学号
	 * @param name 姓名
	 */
	public Student(int id,String name){
		this.sid=id;
		this.sname=name;
	}
	
	public void say(){
		System.out.println("你好！");
	}
	
	public void eat(){
		System.out.println("正在吃饭...");
	}
	
	
	/**
	 * 输出显示学生信息
	 */
	public String toString(){
		return "学生：[学号："+sid+","+"姓名："+sname+","+"年龄："+sage+","+"性别："+ssex+"]";
	}
}
