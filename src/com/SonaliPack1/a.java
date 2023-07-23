package com.SonaliPack1;


public class a{
	  int a;
	   static private int b;
	   static protected int c;
	   public int d; 
	   
	   void m1() {
		   System.out.println("a==="+a);
		   System.out.println("b==="+b);
	   }
	   
static void m2() {
		   a obj=new a();
		   System.out.println("a==="+obj.a);
		   System.out.println("b==="+b);
	   }
}

class B {
	void m2() {
		  a obj=new a();
		   System.out.println("a==="+obj.a);
		   System.out.println("b==="+a.c);//
	}
static void m3() {
	 a obj=new a();
	   System.out.println("a==="+obj.a);
	   System.out.println("b==="+a.c);
	}
}