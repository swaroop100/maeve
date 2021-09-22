package com.inheritance;



 class Overridings {
	
	void run()
	{
		System.out.println("bike is running");
	}
}

public class  Bike extends Overridings
{
	void run()
	{
		System.out.println("bike is running");
	}
	public static void main(String[] args) {
	
		Bike boj = new Bike();
		boj.run();
	}



}