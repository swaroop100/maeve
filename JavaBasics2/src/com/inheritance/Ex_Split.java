package com.inheritance;

public class Ex_Split {

	public static void main(String[] args) {
	
		String s1="java string methods";
		String []w=s1.split("\\s");

		for(String words:w)
		{
			System.out.println(words);
		}
		
		
	}

}
