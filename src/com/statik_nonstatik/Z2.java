package com.statik_nonstatik;



public class Z2 {

	static int a;//static variable

	public static void main(String[] args) //static context
	{
		System.out.println(a);//0 //directly
		System.out.println(Z2.a);//0 // using class name
Z2 obj1 = new Z2 ();
System.out.println(obj1.a);//0 //using object reference variable
	}
	}


