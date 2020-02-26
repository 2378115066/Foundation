package com.daiinfo.oop.abstracts;

public class Rectangle extends Shape {
	private double length;
	private double wide;

	public Rectangle(double length, double wide){
		super();
		this.length = length;
		this.wide = wide;
	}

	public double getArea(){
		return length * wide;
	}

	public double getPerimeter() {
		return (length + wide) * 2;
	}
}
