package com.basicdemo;

public class BasicDemo {
    int a;//instance variable
    static int b;//static variable
    char c='a'; 
    boolean aa=true; 
    String s="aaaaaa";//System defined data type
    BasicDemo dd;//User Defined data type
    
    void m1() {// instance method
    	int c;
    	
    	System.out.println("Inside instance method");
    	String ss=new String();
    }
    
   static  void m2() {// static method
    	System.out.println("Inside static method");
    	
    }
   
   {
	System.out.println("inside instance block");   
	   
   }
   
   static{
	   System.out.println("inside static block");
	   
   }
   
   
 

@Override
public String toString() {
	return "BasicDemo [a=" + a + ", c=" + c + ", aa=" + aa + ", s=" + s + ", dd=" + dd + "]";
}

public static void main(String[] args) {
	System.out.println("===Welcome====");
	BasicDemo b1=new BasicDemo();
	 BasicDemo b2=new BasicDemo();
	 
	 System.out.println("b1===="+b1.hashCode());
	 System.out.println("b2===="+b2.getClass());
	 
	 A a1=new A();
	 
	 System.out.println("a1===="+a1.getClass());
}
}


