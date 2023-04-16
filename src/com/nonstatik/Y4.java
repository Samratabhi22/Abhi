package com.nonstatik;

public class Y4 {
	int a;
	int b;
	Y4(int i,int j)
	
	{
		a=i;
		b=j;
	}

	public static void main(String[] args) {
		Y4 obj1 = new Y4(10,20);
		Y4 obj2 = new Y4(30,40);
		Y4 obj3 = new Y4(50,60);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj3.a);
		System.out.println(obj3.b);
	}

}
