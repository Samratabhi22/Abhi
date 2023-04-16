package com.nonstatik;

public class Y5 {
int a;
int b;
Y5(int a, int b)
{
	this.a=a;
	this.b=b;
}
	public static void main(String[] args) {
		Y5 obj1 = new Y5 (10,20);
		Y5 obj2 = new Y5 (30,40);
		Y5 obj3 = new Y5 (50,60);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj3.a);
		System.out.println(obj3.b);
	}

}
