package com.daiinfo.oop.abstracts;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("请输入正方形的边长：");
        double length = scan.nextDouble();
        Square s = new Square(length);
        System.out.println("正方形的面积为："+s.getArea());
        System.out.println("正方形的周长为："+s.getPerimeter());
        
        
        System.out.println("请输入长方形的长：");
        length = scan.nextDouble();
        System.out.println("请输入长方形的宽：");
        double wide = scan.nextDouble();
        Rectangle r = new Rectangle(length,wide);
        System.out.println("长方形的面积为："+r.getArea());
        System.out.println("长方形的周长为："+r.getPerimeter());
        
        
        System.out.println("请输入圆形的半径：");
        double radius = scan.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("圆形的面积为："+c.getArea());
        System.out.println("圆形的周长为："+c.getPerimeter());
        

        scan.close(); 
   }
}
