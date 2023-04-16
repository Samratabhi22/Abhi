package com.nonstatik;

public class C {
	C(int a,int b) //default access specifier as nothing is mentioned
	{                    // parameterized constructor
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

C obj1=new C(10,20);//object reference variable and creating object for class C
C obj=new C(30,40);
	}

}
