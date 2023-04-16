package com.nonstatik;

public class O {

	{
		int a=5;//local variable of this non static block
	}
	public static void main(String[] args) {
		O obj1 = new O();
		System.out.println(obj1.a);

	}

}
//so, we can't use (print) this local variable a in main method 