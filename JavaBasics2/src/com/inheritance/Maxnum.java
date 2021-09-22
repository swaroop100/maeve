package com.inheritance;

import java.util.Scanner;

public class Maxnum {
	
	
		public static void main(String[] args) {
		
		
		int a,b,c,d;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first num :");
		a=sc.nextInt();
		
		System.out.println("enter second num :");
		b=sc.nextInt();
		System.out.println("enter third num :");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("first is the greatest");
		}else
			if(b>a && b>c)
			{
				System.out.println("second is the greatest");
			}else
			{
				System.out.println("third is the greatest");
			}
		
		
		
		
		
		}

		
		
}
