package com.daiinfo.oop.abstracts;

public class Square extends Shape{
	private double length;

	public Square(double length){
		this.length = length;
	}

	public double getArea(){
		return length * length;
	}

	public double getPerimeter(){
		return 4 * length;
	}
}
