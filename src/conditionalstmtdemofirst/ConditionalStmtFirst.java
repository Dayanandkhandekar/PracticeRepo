package conditionalstmtdemofirst;

import java.util.Scanner;

public class ConditionalStmtFirst {
public static void main(String[] args) {
	 IfDemoFirst obj = new  IfDemoFirst();
	// obj.m1();
	 
	 
	 IfDemoFirstSecond obj1 = new  IfDemoFirstSecond();
	// obj1.m2();
	 
	// IfDemoFirstSecond.m3();
	 
	 IfDemoFirstSecond.m4();
	 
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
			
}