package com.basicdemo;

import java.util.Scanner;

public class CondtionalStmtinJava {
   public static void main(String[] args) {
	
}
}

class IfDemo{
	
	void m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ur Age");
		int age=sc.nextInt();
		  if(age > 18) 
			  System.out.println("Ur Eligible For Voting");
		  System.out.println("Ur Not Eligible For Voting");
		  System.out.println("===EOP====");
	}
	
}
