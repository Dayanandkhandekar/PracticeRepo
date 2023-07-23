package com.pack1;

public class A {
	  int a;
	   static private int b;
	   static protected int c;
	   public int d; 
	   
	   void m1() {
		   System.out.println("a==="+a);
		   System.out.println("b==="+b);
	   }
	   
 static void m2() {
		   A obj=new A();
		   System.out.println("a==="+obj.a);
		   System.out.println("b==="+b);
	   }
}

class B {
	void m2() {
		  A obj=new A();
		   System.out.println("a==="+obj.a);
		   System.out.println("b==="+A.c);
	}
static void m3() {
	 A obj=new A();
	   System.out.println("a==="+obj.a);
	   System.out.println("b==="+A.c);
	}
}
