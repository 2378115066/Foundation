package com.daiinfo.oop.encapsulation;

import java.security.PublicKey;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 创建第一个学生
		Student s1 = new Student();
		s1.sid = 201909888;
		s1.sname = "张三";
		s1.sage = 19;
		s1.ssex = "男";

		System.out.println(s1.toString());// 输出

		// 创建第二个学生
		Student s2 = new Student(20190009, "李四");
		System.out.println(s2.toString());

	}
}
