package com.inheritanse;

public class K extends J
{
    {
    	System.out.println("From IIB of K");
    }
    
    K()
    {
    	super(4);
    	System.out.println("From K(int)");
    }
    K(double a)
    {
    	this();
    	System.out.println("From K (double)");
    }

}
