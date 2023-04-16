package com.encapsulatiion;

public class Driver3 {

	public static void main(String[] args) {
		Emplooyee e1=new Emplooyee("Nandu",1,50000.0,"Test Engineer");
		Emplooyee e2=new Emplooyee("Sai",2,70000.0,"Developer");
		Emplooyee e3=new Emplooyee("Pihu",3,60000.0,"HR");
		
		e1.setEid (4); //modifying value of a variable
		displayDetails(e1);
		displayDetails(e2);
		//displayDetails(e3);
	}
public static void displayDetails(Emplooyee s)
{
	System.out.println("Name :"+s.getName());// Reading value of variable
	System.out.println("Eid :"+s.getEid());
	System.out.println("Salary :"+s.getSalary());
	System.out.println("Designation :"+s.getDesignation());
	s.work();
	System.out.println("======================================================================");

	}

}
