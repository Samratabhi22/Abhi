package com.nonstatik;

public class U {
	int a;
public void test()
{
	int a=8;
	System.out.println(a);
	System.out.println(this.a);
}
	public static void main(String[] args) {
		U obj =new U();
		obj.test();
	

	}

}
