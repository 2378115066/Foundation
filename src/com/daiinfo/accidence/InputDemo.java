package com.daiinfo.accidence;

import javax.swing.JOptionPane;

public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s=JOptionPane.showInputDialog("请输入一个数字：");
		int  m=Integer.parseInt(s);
		//System.out.println("你输入的数是"+m);
		JOptionPane.showMessageDialog(null, m);
	}

}
