package com.chaitralidemo;

import java.util.Scanner;

public class IfDemoStatement {
       public static void main(String[] args) {
    	   Abc obj=new Abc();
    	   //obj.m1();
    	   Xyz obj1=new Xyz(); 
    	   //obj1.m2(); 
    	   obj1.m3();
    	   
}
}

class Abc {
	void m1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Check the Number");
		int Number=sc.nextInt();
		     if(Number > 6 )
			System.out.println("Positive");
		    System.out.println("Negative");
	}	
}
class Xyz {
        void m2 () {
		Scanner sc=new Scanner(System.in);
		System.out.println("Check the Number");
		int Number=sc.nextInt();
		 if(Number / 2 == 0)
		System.out.println("Odd");
		System.out.println("Even");
		
	}
	void m3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		if(num1 > num2)
			System.out.println("Greater no==="+num1);
		else
			System.out.println("Greater no==="+num2);
			
		
		
		
			
}
	void m4() {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();			
		if(num % 3 == 0 && num % 4 == 0) {
			System.out.println("Divisble by 3 ==="+num);
		    System.out.println("Divisble by 4 ==="+num);}
		else
			System.out.println("Not Divisble by 3 and 4==="+num);
}

}