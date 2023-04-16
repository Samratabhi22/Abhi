package com.inheritanse;

public class Driver1 {

	public static void main(String[] args) {
		C obj1=new C();//super class object
		System.out.println(obj1.a);//0
		obj1.test1();// from non static test1() of C
		//System.out.println(obj1.b);//CTE
		//obj1.test2();//CTE
		
		
		D obj2 = new D();//sub class object
		System.out.println(obj2.b);//0
		obj2.test2();//from non static test2() of D
		System.out.println(obj2.a);//0
		obj2.test1();//From non static test1() of C

	}

}
