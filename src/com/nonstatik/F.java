package com.nonstatik;

public class F {
int a;
F()
{
	System.out.println("constructor executed");
}
	public static void main(String[] args) {
	System.out.println("main() started");
	F obj1=new F();
System.out.println(obj1.a);
obj1.a=10;
System.out.println(obj1.a);
	}

}
