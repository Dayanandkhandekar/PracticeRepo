package conditionalstmtdemofirst;

import java.util.Scanner;

public class ConditionalStmtFirst {
public static void main(String[] args) {
	 IfDemoFirst obj = new  IfDemoFirst();
	// obj.m1();
	 
	 
	 IfDemoFirstSecond obj1 = new  IfDemoFirstSecond();
	// obj1.m2();
	 
	// IfDemoFirstSecond.m3();
	 
	 //IfDemoFirstSecond.m4();
	 
	 IfDemoFirstSecond.m5();
	 
}
}
class IfDemoFirst {
	void m1() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("check the no");
		        int number=sc.nextInt();
				if(number > 0)
			System.out.println("the no is positive");
		    System.out.println("the no is negative");
		    
	}
}
class  IfDemoFirstSecond {
	void m2 () {
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("check the no");
		int number = sc.nextInt();
		    if(number / 2 == 0)
		    	System.out.println("the no is even");
		         System.out.println("the no is odd");
			
	}
	static void m3 () {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Enter first no");
		 int num1 = sc.nextInt();
		 System.out.println("Enter second no");
		 int num2 = sc.nextInt();
		 if(num1 > num2)
			 System.out.println("greater no ="+num1);
		 else
			 System.out.println("greater no ="+num2);
	}
	static void m4() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no");
		int num =sc.nextInt();
		
		if(num % 3 == 0 && num % 4 == 0)
		{
			System.out.println("this no is divisible by 3 and 4");
			
			}
		else {
			System.out.println("this no is not divisible by 3 and 4");
		}
		}
	static void m5() {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Enter first no");
		 int num3 = sc.nextInt();
		 System.out.println("Enter second no");
		 int num4 = sc.nextInt();
		 
		 
		 System.out.println("select opt");
		 System.out.println("1. Add");
		 System.out.println("2.sub");
		 System.out.println("3.multi");
		 System.out.println("4.div");
		 System.out.println("5.check first num is even or odd");
		 
		 int opt=sc.nextInt();
		 
		 
		if(opt==1) {
			 int c=num3+num4;
			 System.out.println( "Ans is "+ c);
		 }
			
		else if(opt==2) {
			 int c=num3-num4;
			 System.out.println( "Ans is "+ c);
		 }
		else if(opt==3) {
			 int c=num3*num4;
			 System.out.println( "Ans is "+ c);
		 }
		else if(opt==4) {
			 int c=num3/num4;
			 System.out.println( "Ans is "+ c);
		 }
		else if(opt==5);
		{
		    int c=num3 % 2; 
		    System.out.println("the no is even");
		      System.out.println("the no is odd");
			

		}
	}
}

		     
		   
		         
	

		        
		     

	
		
		
			
	
	
	
	
	
	
	
	
	
	
	