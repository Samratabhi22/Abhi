package com.inheritanse;

public class I 
{
	{
		System.out.println("From IIB");
	}
	I()
	{
		System.out.println("From I()");
	}
	I(int a)
	{
		this();
		System.out.println("From I (int) ");
	}
	public static void main(String[] args)
	{
		I obj1 = new I(10);
	}
}
