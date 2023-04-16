package com.inheritanse;

public class H 
{
H()
{
	this(10);
	System.out.println("From H()");
}

	H(int a)
	{
		this();
		System.out.println("From H (int)");
	}

	public static void main(String[] args) 
	{
		H obj1 = new H();

	}

}
