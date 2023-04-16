package com.encapsulatiion;

public class Driver4 {

	public static void main(String[] args) {
		Emmployee e1=new Emmployee("Nandu",1,20000.0,"Test Engineer");
		Emmployee e2=new Emmployee("Sai",2,30000.0,"Developer");
		Emmployee e3=new Emmployee("Pihu",3,80000.0,"HR");
		
		e1.setEid (4); //modifying value of a variable
		displayDetails(e1);
		displayDetails(e2);
		displayDetails(e3);
	}
public static void displayDetails(Emmployee s)
{
	System.out.println("Name :"+s.getName());// Reading value of variable
	System.out.println("Eid :"+s.getEid());
	System.out.println("Salary :"+s.getSalary());
	System.out.println("Designation :"+s.getDesignation());
	s.work();
	System.out.println("======================================================================");

	}
		

	

}
