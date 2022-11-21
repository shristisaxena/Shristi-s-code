package com.greatlearning.corejava;

public class ConstructorDemo1 {
	
	public ConstructorDemo1() {
		System.out.println(" I am default constructor. ");
	}
	
	public ConstructorDemo1(int a, float f, String s, char c) {
		System.out.println(" /n I am Parameterized constructor. I take various arguments as input. ");
	
		System.out.println(" The square of an Integer number is : " + a * a);
		System.out.println(" The square of a float number is : " + f * f);
		System.out.println(" The string you inputted is : " + s);
		System.out.println(" The inputted character is : " + c);
	}
	
	public void observations() {
		System.out.println("Inside Observations method ");
	}

	public static void main(String[] args) {
		
		System.out.println(" From Object creation method 1 ");
		ConstructorDemo1 obj = new ConstructorDemo1();
		ConstructorDemo1 obj1 = new ConstructorDemo1(5, 0.5f, "hello learner", 'z');
		
		System.out.println("/n From Object creation method 2 ");
		ConstructorDemo1 obj2, obj3;
		obj2 = new ConstructorDemo1();
		obj3 = new ConstructorDemo1(15, 2.5f, "hi learner", 'w');
		
		obj.observations();		
		// TODO Auto-generated method stub

	}

}
