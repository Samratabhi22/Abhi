package com.nonstatik;

public class Z1 {
static int i;
Z1(){
	System.out.println(i);// correct no error
	System.out.println(Z1.i);//correct no error
	System.out.println(obj1.i);//CTE
}
	public static void main(String[] args) {
		Z1 obj1 =new Z1();
		

	}

}
