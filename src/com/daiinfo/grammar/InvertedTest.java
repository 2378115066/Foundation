package com.daiinfo.grammar;

import java.util.Scanner;
/**
 * 逆序输出
 * @author Daiyuanq
 *
 */
public class InvertedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = scan.nextInt();
		System.out.println("你输入的数是：" + n);
		System.out.println("其逆序输出是：");
		int m = n;
		while (m!=0) {
			System.out.print(m % 10+"\t");//输出尾数
			m = m / 10;                   //取整
		}
	}

}
