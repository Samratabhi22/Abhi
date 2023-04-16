package com.nonstatik;

public class W {
	int a;// non static variable
	W (int a)//parameterized constructor------->non static context
	{
		System.out.println(a);//10
		System.out.println(this.a);//0
	}

	public static void main(String[] args) {
	
W obj1 = new W(10);
	}

}
