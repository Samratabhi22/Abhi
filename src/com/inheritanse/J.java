package com.inheritanse;

public class J 
{
	{
		System.out.println("From IIB of J");
	}
	J()
	{
		System.out.println("From J()");
	}
	J (int a)
	{
		this(5,6.5);
		System.out.println("From J (int)");
	}
	J (int a, double b)
	{
		this();
		System.out.println("From J(int , double)");
	}
}
