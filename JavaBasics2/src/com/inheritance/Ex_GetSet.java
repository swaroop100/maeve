package com.inheritance;

public class Ex_GetSet {
private int num;
public int getthisnum()
{
	return this.num;
}

public void setnum(int num1)
{
	this.num=num1;
}
	public static void main(String[] args) {
		Ex_GetSet obj=new Ex_GetSet ();
		obj.num=10;
		int num2=obj.num;
		System.out.println(num2);

		//soln
		obj.setnum(10);
		int n= obj.getthisnum();
		System.out.println("num is "+n);
	}

}
