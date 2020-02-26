package com.daiinfo.oop.interfaces.animal;

import java.util.jar.Attributes.Name;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panda p=new Panda("貝貝", 4);
		System.out.println(p.name+"正在吃的食物是:"+p.food);
		p.eat();
		System.out.println(".......");
		Panda p2=new Panda("欢欢", 3);
		p2.sleep();		
		
		System.out.println(".......");
		Tiger t=new Tiger("小花", 3);
		t.eat();
		t.sleep();
		
		System.out.println(".........");
		Mouse m=new Mouse("小黑", 6);
		m.eat();
				
		
	}

}
