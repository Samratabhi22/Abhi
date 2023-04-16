package com.statik_nonstatik;

public class Z7 
{
static int a =10;
int b=20;
int a=30;//CTE // calling more than one global variable with same name
	public static void main(String[] args) 
	{
		
		Z7 obj1 = new Z7();
System.out.println(a);
System.out.println(b);//CTE // calling non static variable directly
System.out.println(Z7.b);//CTE // calling non static variable class name
System.out.println(obj1.b);// correct no error 
	}

}
