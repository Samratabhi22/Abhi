package com.nonstatik;

public class P1 {
	
	
	P1()
	{
		System.out.println("From constructor");
	}
	{
		System.out.println("From NSB");
	}

		public static void main(String[] args) {
			System.out.println("From main()");
			P1 obj1 = new P1();


	}

}
