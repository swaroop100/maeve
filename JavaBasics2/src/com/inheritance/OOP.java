package com.inheritance;

public class OOP {

	public static void main(String[] args) {
		OOP op = new OOP(); // object creation of class
		op.method1(); // calling method
		op.method2();
		System.out.println("output of addition is "+op.additionn(10, 20));
	}

	public void method1()
	{
		System.out.println("in method1");
	}

	public void method2()
	{
		System.out.println("in method2");
	}

	public int additionn(int a,int b)
	{
		return a+b;
	}








}
