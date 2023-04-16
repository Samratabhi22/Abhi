package com.abhi;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "page 14 of 116";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)){
						System.out.print(ch);		
			}
		}
		

		
	}

}
