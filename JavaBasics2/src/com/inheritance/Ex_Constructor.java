package com.inheritance;

public class Ex_Constructor {
	//int a=5;
	int i;
	String name;
	
	
	Ex_Constructor()
	{
		System.out.println("in a default constructor ");
	}
	
	Ex_Constructor(int a)
	{
		System.out.println("in a parameterize constructor "+a);
	}

	Ex_Constructor(int a,String sname)
	{
		i=a;
		name=sname;
		
	}
	
	public void display()
	{
		System.out.println("default value of int is "+i);
		System.out.println("default value ofstring is "+name);
		
	}
	
	public static void main(String[] args) {
	
		Ex_Constructor ec=new Ex_Constructor();
		Ex_Constructor ec1=new Ex_Constructor(5);
		Ex_Constructor ec2=new Ex_Constructor(5,"HELLO");
		ec.display();
		ec2.display();
		
	}

}
