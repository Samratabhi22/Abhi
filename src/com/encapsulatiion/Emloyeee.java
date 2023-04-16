package com.encapsulatiion;

public class Emloyeee 
{
String name;
int eid;
double salary;
String designation;

public void work ()
{
	System.out.println(name+" is working as "+designation);
}
Emloyeee (String name,int eid,double salary,String designation)
{
	this.name = name;
	this.eid = eid;
	this.salary = salary;
	this.designation = designation;
}
}