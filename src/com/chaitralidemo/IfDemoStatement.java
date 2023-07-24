package com.chaitralidemo;

import java.util.Scanner;

public class IfDemoStatement {
       public static void main(String[] args) {
    	   Abc obj=new Abc();
    	   obj.m1();
    	   Xyz obj1=new Xyz(); 
    	   obj1.m2();
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
	
	
	
	
}