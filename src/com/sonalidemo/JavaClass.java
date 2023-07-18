package com.sonalidemo;

public class JavaClass {
	//variable-name giving to memory location
	//types of variables-instance,static,local
	//syntax datatype variable ;
	int k;//instance
	static int m;//static

	
	

	
//datatype which type of value to be store
	//there are two types primitive and non primitive data type
	//primitive ----- we cannot create object of primitive
	//numeric byte,short,int,long,float,double
	//character   char c='a';(single character write here)
	//boolean true/false
	
	//non primitive-----we can create object of primitive
	//a.system defined data type eg.string,stringBuilder,stringbuffere,Allwrapperclasses,etc
	//string s = "aaaaaa"(multiple character write)
	//b.user defined data type ------all classes created by user
	//eg-BasicDemo dd;
	
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
       




	@Override
	public String toString() {
		return "JavaClass [k=" + k + "]";
	}

	//to create object
			//1.using new keyword
			//classname name=keyword classname();
	public static void main(String[] args) {
		System.out.println("welcome");
		JavaClass b1=new JavaClass();
		JavaClass b2=new JavaClass();
		
		
		System.out.println("b1====="+b1);
		System.out.println("b2====="+b2);
		
		
		System.out.println("b1====="+b1.hashCode());
		System.out.println("b2====="+b2.hashCode());
		
		System.out.println("b1====="+b1.getClass());
		System.out.println("b2======"+b2.getClass());
		
	}
}



