package com.statik_nonstatik;

public class Z9 
{     static int a; //static variable
static //static block
{
	System.out.println("From SIB of Z9");
	a=10;
}
public static int test()//static method
{
	System.out.println("From test() of Z9");
	return 5;
}

	public static void main(String[] args) //static method
	{
		System.out.println("From main() of Z9");

	}

}
