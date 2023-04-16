package com.nonstatik;

public class Q {
	int a;
	int b;
	{
		System.out.println("From NSB 1");
		a=10;
		System.out.println(a);
		System.out.println(b);
	}
	{
		System.out.println("From NSB 2");
		b=20;
		int a=100;
		System.out.println(a);
		System.out.println(b);
	}
		Q()
		{
			System.out.println("From Q()");
		
		}
	Q(int i)
	{
		System.out.println("From Q(int i)");
	}
	public static void main(String[] args) {
	System.out.println("From main()");
Q obj1 = new Q();
Q obj2 = new Q(50);
	}

}
