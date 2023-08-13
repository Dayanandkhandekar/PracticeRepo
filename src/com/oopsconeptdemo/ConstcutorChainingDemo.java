package com.oopsconeptdemo;

public class ConstcutorChainingDemo {
   public static void main(String[] args) {
	B a1=new B();
	
}
}
class A {
	  int a;
	  int b;
	public A () {
		this(10);
		System.out.println("Inisde No Arg A");
	}
	
public A (int a) {
	this(10,20);
	System.out.println("Inisde Single A");
	}

   public A (int a,int b) {
	   System.out.println("Inisde Two para A");
   }
}

class B extends A{
	
	  void m1() {
		  
		  super.a=10;;
	  }
	  
	  public B () {
		  this(10);
		  System.out.println("Inside No arg B");
	  }
	  
 public B (int a) {
	 super();
	 System.out.println("InsideSingle para B");
	  }
}