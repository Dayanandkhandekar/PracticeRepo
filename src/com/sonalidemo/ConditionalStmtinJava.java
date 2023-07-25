package com.sonalidemo;

import java.util.Scanner;

public class ConditionalStmtinJava {
public static void main(String[] args) {
	IfDemo obj=new IfDemo();
	obj.m1();
}
}
class IfDemo {
	
	void m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("inside instance method");
		System.out.println("enter ur age");
		int age=sc.nextInt();
		  if(age > 18)
			  System.out.println("ur eligible for voting");
		      System.out.println("ur not eligible for voting");
	}
	
	static void m2 () {
		System.out.println("inside static method");
	}
}