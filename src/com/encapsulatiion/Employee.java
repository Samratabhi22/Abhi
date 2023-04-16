package com.encapsulatiion;

public class Employee 
{
	String name;
	int eid;
	double salary;
	String designation;


public void work()
{
	System.out.println(name+"is working as"+designation);
}
Employee(String name,int eid,double salary,String designation)
{
	this.name=name;
	this.eid=eid;
	this.salary = salary;
	this.designation = designation;
	
}
} 