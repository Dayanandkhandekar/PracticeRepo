package com.chaitralidemo;

import java.util.Scanner;

public class Conditionalstatement {
      public static void main(String[] args) {
    	  IfDemo obj=new IfDemo();
    	  obj.m1();6
	}
}
class IfDemo{ 
	void m1()   {//instance method 
		System.out.println("instance method");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your year");
		int year=sc.nextInt();
		if(year % 4 == 0)
		 System.out.println("leap year");
		System.out.println("not leap year");
	}    
	
	
	
	
	static void m2() {//static method
		System.out.println("static method");
	}
}