package com.inheritance;

 class Employee
{
int sal=40000;
}

public class Programmer extends Employee
{
	int bonus=10000;
	public static void main(String[] args) {
		Programmer p= new Programmer();
		System.out.println("programmer salary with bonus is "+(p.sal+p.bonus));
		System.out.println("programmer bonus is "+p.bonus);
	}

}
