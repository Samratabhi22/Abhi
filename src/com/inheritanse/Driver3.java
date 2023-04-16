package com.inheritanse;

public class Driver3 {

	public static void main(String[] args) {
		C1 obj1 = new C1();

	}

}
/*order of constructor invocation (calling)---->C1()---->B1()---->A1()---->object()
 * order of completion of execution of constructors---->object()---->A1()---->B1()---->C1()
 * 
 */
