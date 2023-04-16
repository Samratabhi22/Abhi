package Hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1= new HashSet();
		System.out.println(h1.add(10));//true
		System.out.println(h1.add(100));//true
		System.out.println(h1.add(20));//true
		System.out.println(h1.add(201));//true
		System.out.println(h1.add(10));//false
		
		//h1.add(true);
		//h1.add("hello");
		//h1.add(10.5);
		//h1.add('d');
		System.out.println(h1);//view //insertion order random
		System.out.println(h1.size());//8
		for(Object i:h1)
		{
			System.out.println(i);
		}
		ArrayList a1=new ArrayList(h1);
		Collections.sort(a1);
		System.out.println("After sorting "+a1);
		for(Object j:a1)
		{
			System.out.println(j);
		}
		TreeSet t1 = new TreeSet(h1);
		System.out.println(t1);

	}
	/*
	 * for each loop//randomly giving output
	 * 20
100
d
10.5
201
10
hello
true
*/
	 

}
