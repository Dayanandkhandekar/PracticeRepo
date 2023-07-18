package com.chaitralidemo;

public class DemoSecond {
	//variable- It means name given to memory location
	//There are 3 types of variables-instance,static,local
	//syntax Datatype variable;
	         int c;//(instance variable)
	         //static int c;---(static variable)        
	public static void main(String[] args) {
		    int c;//(local variable)
		System.out.println("hello");
		System.out.println("hello welcome");
		System.out.println("i am chaitrali");
	    System.out.println("good morning");
	} 
	
	
//Method syntax-
             //datatype methodname() {methodbody}  
    //There are 2 type of methods and 2 type of blocks
   //Method-1.instance method 2.static method
  //Block-1.instance block 2.static block

         void m1() { //instance method
        //business logic write here 
         }

   static void m2() {//static method 
	   //business logic 
   }   
  
   {
	   
	  System.out.println("inside instance block");
   
   }
   
   static {
       System.out.println("static block");
    }
   static {
	   System.out.println("static block one");
}
   static {
	   System.out.println("static block two");
   }
	static {
		System.out.println("static block 3");
		
	}
 }

	
  