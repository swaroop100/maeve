package com.inheritance;

public class Testerr extends Empp {
	private String projName;
	private int noOfDays;
	private double incentive;
	
	public Testerr()
	{
		super();
		projName="account management";
		noOfDays=10;
		incentive=noOfDays*100;
		
	}
	
	public Testerr(int empID,String firstName,String lastName,double basicSal,String projName,int noOfDays)
	{
		super(empID,firstName,lastName,basicSal);
		this.projName=projName;
		this.noOfDays=noOfDays;
		this.incentive=noOfDays * 100;
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("project name :"+projName);
		System.out.println("no of days :"+noOfDays);
		System.out.println("incentive :"+incentive);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
