package com.inheritance;





public class Ex_Interface implements printable,showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_Interface obj =new Ex_Interface();
		obj.print();
		obj.show();
	}

	
	public void print() {
		System.out.println("hello  in print method");
		
	}


	public void show() {
		System.out.println("hello  in show method");
		
	}

}
