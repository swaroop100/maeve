package com.inheritance;

public class Ex_Methodoverloading {
	
	
	
	
	
	public void additionn(int a,int b)
	{
		System.out.println("addition of int is "+(a+b));
	}

	public void additionn(float a,float b)
	{
		System.out.println("addition of float is "+(a+b));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_Methodoverloading mo=new Ex_Methodoverloading();
		mo.additionn(2.5f, 2.5f);
		mo.additionn(5, 5);
	
	}

}
