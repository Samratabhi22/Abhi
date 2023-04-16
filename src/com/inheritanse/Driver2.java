package com.inheritanse;

public class Driver2 {

	public static void main(String[] args) {
		E1 obj1 = new E1();//super class object
		//using object reference variable of super class type
		// Accessing static variable of super class 
		System.out.println(obj1.a);
		//Accessing non-static variable of super class 
		System.out.println(obj1.i);
		//Accessing static variable of sub class 
System.out.println(obj1.b);//CTE
//Accessing non-static variable of sub class 
System.out.println(obj1.j);//CTE
E2 obj2=new E2();//sub class object
//using object reference variable of sub class type
		// Accessing static variable of sub class 
System.out.println(obj2.b);
//Accessing non-static variable of sub class 
System.out.println(obj2.j);
//Accessing static variable of super class 
System.out.println(obj2.a);
//Accessing non-static variable of super class
System.out.println(obj2.i);
	}

}
