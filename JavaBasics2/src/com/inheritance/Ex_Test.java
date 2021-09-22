package com.inheritance;

public class Ex_Test {

	public static void main(String[] args)
	{
		printable obj =new Ex_Interface();
		obj.print();
		showable obj1 =new Ex_Interface();
		obj1.show();
		
		// webdriver driver;
		//driver= new ChromeDriver();
		//driver= new FirefoxDriver();

		// so that we can access all the functions 
		//  in that both class using same object
	}

}
