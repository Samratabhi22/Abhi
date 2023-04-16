package com.statik_nonstatik;

public class Z4 {
	static int a;//static variable
	Z4()//non static context
	
	{
		System.out.println(Z4.a);//using  class name
				System.out.println(a);//directly
System.out.println(this.a);//using this keyword
	}
public void test()
{
	System.out.println(Z4.a);//using  class name
	System.out.println(a);//directly
System.out.println(this.a);//using this keyword
}
	public static void main(String[] args) {
	Z4 obj1 =new Z4();
	obj1.test();//correct no error
	test();//CTE
	Z4.test();//CTE

	}

}
