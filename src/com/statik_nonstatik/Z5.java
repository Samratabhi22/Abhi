package com.statik_nonstatik;

public class Z5 {
	static int a;//static variable
	Z5()//non static context
	
	{
		System.out.println(Z5.a);//using  class name
				System.out.println(a);//directly
System.out.println(this.a);//using this keyword
	}
	public static void main(String[] args) {
		Z5 obj1 =new Z5();

	}

}
