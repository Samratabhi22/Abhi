package com.nonstatik;

public class H {
int a;
int b;

	public static void main(String[] args) {
		H obj1=new H();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		obj1.a=10;
		obj1.b=20;
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		H obj2=new H();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		obj2.a=100;
		obj2.b=200;
		System.out.println(obj2.a);
		System.out.println(obj2.b);
	}

}
