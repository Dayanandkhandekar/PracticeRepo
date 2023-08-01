package com.basicdemo;

import java.util.Scanner;

public class CondtionalStmtinJava {
   public static void main(String[] args) {
	   // IfDemo.ifelseDemo();
	   IfDemo.swicthDemo();
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
	
	static void ifelseDemo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ur Age");
		int age=sc.nextInt();
		  if(age > 18) {
			  System.out.println("Ur Eligible For Voting");
		  System.out.println("hi");
		  }
		  else
			  System.out.println("Ur Not Eligible For Voting");
		  System.out.println("===EOP====");
			    
	}
	
	static void ifesleifDemo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int num1 = sc.nextInt();
		System.out.println("Enter second no");
		int num2 = sc.nextInt();
		System.out.println("Enter third no");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("greater no =" + num1);

		} else if (num2 > num1 && num2 > num3) {
			System.out.println("greater no =" + num2);

		} else if (num3 > num1 && num3 > num2) {
			System.out.println("greater no =" + num3);

		} else {
			System.out.println("All are Equals");
		}
	}
	
	static void swicthDemo() {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Enter first no");
		 int num3 = sc.nextInt();
		 System.out.println("Enter second no");
		 int num4 = sc.nextInt();
		 int a=10;
		 
		 System.out.println("select opt");
		 System.out.println("1. Add");
		 System.out.println("2.sub");
		 System.out.println("3.multi");
		 System.out.println("4.div");
		 System.out.println("5.check first num is even or odd");
		 
		 int opt=sc.nextInt();
		 
		 switch(opt) {
		 case 1:
			 int add=num3+num4;
			 System.out.println( "Ans is "+ add);
			 break;
			 
		 case 2:
			 int sub=num3-num4;
			 System.out.println( "Ans is "+ sub);
			 break;
		 case 3:		 
			 int mul=num3*num4;
			 System.out.println( "Ans is "+ mul);
			 break;
		 case 4:
			 int c=num3/num4;
			 System.out.println( "Ans is "+ c);
			 break;
		 case 5:
			       if (num3 % 2==0) { 
				    System.out.println("the first no is even");
				    }else {
				    System.out.println("the first no is odd");
				    }
			       break;  
			default: System.out.println("Invalid Choice");       
		 
		 }
		 
		
	}
	
}
