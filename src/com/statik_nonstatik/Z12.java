package com.statik_nonstatik;

public class Z12 
{ 
	int j;
Z12()
{
	System.out.println("From constructor of Z12");
	j=5;
}

	public static void main(String[] args) 
	{
	System.out.println("From main() of Z12");
	
Z11 obj1 =new Z11();
Z12 obj2 =new Z12();
obj2.j=obj1.test();
System.out.println(obj2.j);
System.out.println(obj1.i);
	}

}
