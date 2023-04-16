package com.inheritanse;

public class H1 {
	H()
	{
		this();
		System.out.println("From H1()");
	}
	H1(int a)
	{
		System.out.println("From H1(int)");
	}
	public static void main(String[] args) 
	{
	
H1 obj1 = new H1();
	}

}
