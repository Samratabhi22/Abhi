package com.statik_nonstatik;

public class Z10 
{
static int b;
static {
	System.out.println("From SIB of Z10");
}

	public static void main(String[] args) 
	{
		System.out.println("From main() of Z10");
		int b=Z9.test();
		System.out.println(b);
		System.out.println(Z10.b);
		System.out.println(Z9.a);
	}

}
