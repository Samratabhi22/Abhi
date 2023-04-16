package com.nonstatik;

public class R {
public void test() {
	System.out.println("From test()");
}
	public static void main(String[] args) {
		
System.out.println("From main()");
R obj = new R();
obj.test();
	}

}
