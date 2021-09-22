package com.inheritance;

import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		al.add(2);
		al.add(2.5);
		al.add('a');
		al.add("hello");
		al.add(null);
		
		System.out.println(al.get(4));// get 4th index value i.e null
		
		al.add(4,"welcome"); // add welcome at 4th index
				
		System.out.println(al);
		//al.removeAll(al);  // remoce all the values from  array
		
		//System.out.println(al);
		
		System.out.println(al.size());
		 for(int i=0;i<al.size();i++)
		 {
			 System.out.println(al.get(i));
		 }
		
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("H");
		System.out.println(al2);
	}

}
