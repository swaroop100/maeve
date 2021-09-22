package com.inheritance;

public class Empp extends Person {
	private int empID;
	private double basicSal;
	
	public Empp()
	{
		super();//call parent class constructor
		empID=1;
		basicSal=1000;
	}
	
	public Empp(int empID,String firstName,String lastName,double basicSal)
	{
		super(firstName,lastName);
		this.empID=empID;
		this.basicSal=basicSal;
	}
	
	public void display()
	{
		System.out.println("employee ID :"+empID);
		super.display();
		System.out.println("basic salary  :"+basicSal);
	}
	
	
	
}
