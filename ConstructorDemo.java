package com.greatlearning.corejava;

public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println(" I am default constructor. ");
	}
	
	public ConstructorDemo(int no, float wall, String name, char xyz ) {
		System.out.println(" The number is "+ no +" . Height of the wall is "+ wall +".  My name is "+ name +". First character of my name is " +xyz+ ". ");
	}
	
	public static void main(String[] args) {
		ConstructorDemo constructorDemo;
		constructorDemo = new ConstructorDemo();
		constructorDemo = new ConstructorDemo(10, 12.6f, "Shristi", 's' );
		
		
		
		// TODO Auto-generated method stub

	}

}
