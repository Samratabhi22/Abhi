package com.nonstatik;

public class E1 {
	E1()
	{
		System.out.println("from constructor 1");
	}
	E1(int a)
	{
		System.out.println("from constructor 2");
	}
	E1(double b)
	{
		System.out.println("from constructor 3");
	}

	public static void main(String[] args) {
		E1 obj1 = new E1();
		E1 obj2 = new E1(5);
		E1 obj3 = new E1();
		E1 obj4 = new E1(40.8);
		E1 obj5 = new E1(10);
	}

}
