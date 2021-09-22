package com.inheritance;

public class Ex_static {

	public static void main(String[] args) {
		
		System.out.println("in main method");
		Ex_static st =new Ex_static();
		st.withoutstatic();
		withstatic();

	}

	
	public void withoutstatic()
	{
		System.out.println("in non static method");
	}
	
	public static void withstatic()
	{
		System.out.println("in  static method");
	}
	
	
	
}
