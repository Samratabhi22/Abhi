package com.nonstatik;

public class G {
int i;
int j;
G()
{
	System.out.println("constructor executed");
}
	public static void main(String[] args) {
		System.out.println("from main()");
		G obj1= new G();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		G obj2=new G();
		System.out.println(obj2.i);
		System.out.println(obj1.j);
	}

}
