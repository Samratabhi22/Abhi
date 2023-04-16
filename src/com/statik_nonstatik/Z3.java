package com.statik_nonstatik;

public class Z3 {
int a;//non static variable
	public static void main(String[] args) //static context
	{
		Z3 obj1 = new Z3();
		System.out.println(obj1.a);//0 //using object reference variable

	}

}
