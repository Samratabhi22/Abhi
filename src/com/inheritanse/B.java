package com.inheritanse;

public class B extends A {

	public static void main(String[] args)
	{
		System.out.println(i);//directly calling global static variable
		System.out.println(B.i);//calling global static variable by sub class name
		System.out.println(A.i);//calling global static variable by super class name
		B memory1 = new B();// object creation of B class
			A section1 = new A();//object creation of A class
		System.out.println(memory1.i);//using by calling object ref variable of sub class
				test();//directly calling the static method
		System.out.println(section1.i);//using by calling object ref variable of super class
		B.test();//calling global static method by sub class name
		A.test();//calling global static method by super class name
		memory1.test();//calling static method object ref variable of sub class
		section1.test();// calling static method object ref variable of super class
				
	}

}
