package com.statik_nonstatik;

public class Z8 
{
static int a;
int b;
	public static void main(String[] args) 
	{
		Z8 obj1=new Z8();
		Z8 obj2=new Z8();
		Z8 obj3=new Z8();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		obj2.a=10;
		obj2.b=20;
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj3.a);
		System.out.println(obj3.b);
	}

}
