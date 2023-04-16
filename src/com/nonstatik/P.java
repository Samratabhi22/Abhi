package com.nonstatik;

public class P {

	{
		System.out.println("From NSB");
	}
	P()
	{
		System.out.println("From constructor");
	}
	public static void main(String[] args) {
		System.out.println("From main()");
		P obj1 = new P();

	}

}
