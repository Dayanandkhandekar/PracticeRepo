package com.basicdemo;

public class CallingDemo {

}
 class Abc
{
	int a;
	static int b;
	 void m1() {
		 
		 int c;
		 System.out.println("intance area a==="+a);
		 System.out.println("intance area b==="+b);
	 }
	 
	 static void m2() {
		 Abc obj=new Abc();
		 System.out.println("static area b==="+b);
		 System.out.println("static area a==="+obj.a);
	 }
	 {
		 int c;
		 System.out.println("intance area a==="+a);
		 System.out.println("intance area b==="+b);
		 
		 System.out.println("Inside instance block");
	 }
	 
	 static{
		 System.out.println("Inside static block");
		 Abc obj=new Abc();
		 System.out.println("static area b==="+b);
		 System.out.println("static area a==="+obj.a);
		 
	 }

}

class Pqr{
	
	int aa;
	static int bb;
	
	void m3() {
		 Abc obj=new Abc();
		 System.out.println("static area b==="+Abc.b);
		 System.out.println("static area a==="+obj.a);
		 int d;
	 }
	 
	 static void m4() {
		 Abc obj=new Abc();
		 System.out.println("static area b==="+Abc.b);
		 System.out.println("static area a==="+obj.a);
	 }
	 {
		 
		 System.out.println("Inside instance block");
	 }
	 
	 static{
		 System.out.println("Inside static block");
		 
	 }
}
