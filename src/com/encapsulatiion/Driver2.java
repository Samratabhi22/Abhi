package com.encapsulatiion;

public class Driver2 {

	public static void main(String[] args) 
	{
		Emplooyee e1=new Emplooyee("Nandu",1,50000.0,"Test Engineer");
		Emplooyee e2=new Emplooyee("Sai",2,70000.0,"Developer");
		Emplooyee e3=new Emplooyee("Pihu",3,60000.0,"HR");
		
		e1.eid =4; //modifying value of a variable
		displayDetails(e1);
		displayDetails(e2);
		//displayDetails(e3);
	}
public static void displayDetails(Emplooyee s)
{
	System.out.println("Name :"+s.name);// Reading value of variable
	System.out.println("Eid :"+s.eid);
	System.out.println("Salary :"+s.salary);
	System.out.println("Designation :"+s.designation);
	s.work();
	System.out.println("======================================================================");
	
}

}
