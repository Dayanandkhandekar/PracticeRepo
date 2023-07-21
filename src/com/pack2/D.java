package com.pack2;

import com.pack1.A;

public class D extends A{
  void m2() {
	  A obj=new A();
	  // System.out.println("a==="+obj.c);
	  D obj1=new D();
	  System.out.println("a==="+obj1.c);
  }
}
