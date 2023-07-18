package com.sonalidemo;

public class JavaClass {
	//variable-name giving to memory location
	//types of variables-instance,static,local
	//syntax datatype variable ;
	int s;//instance
	static int m;//static
	public static void main(String[] args) {
		int l;//local
		System.out.println("hello welcome");
	}
	
	//syntax 
   // datatype/returntype   methodname()  {//method body }
	
	void m1() {// instance method
		// business logic write here
	}
	
	static void m2() {// static method
		// business logic write here
	}
    
	{
		
		System.out.println("Inside instance block");
		
	}
	
	static {
		System.out.println("Static block");
	}
	
}
