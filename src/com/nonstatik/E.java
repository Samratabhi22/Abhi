package com.nonstatik;

public class E {

	E()
	{
		System.out.println("from constructor 1");
	}
	E()
	{
		System.out.println("from constructor 2");
	}
	public static void main(String[] args) {
		E obj1 = new E();

	}

}
