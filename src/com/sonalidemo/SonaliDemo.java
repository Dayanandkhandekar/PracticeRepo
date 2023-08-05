package com.sonalidemo;

import java.util.Scanner;

public class SonaliDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("enter a no");
		int num = sc.nextInt();
		System.out.println("choice");
		System.out.println("1.The no even or odd");
		System.out.println("2.The no is divisible by 5");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		   case 1:
			  for(int i=1;i<=num;i++) {
				  if(i%2==0)
					  System.out.println("even no=="+i);
			  
			  }
			  break; 
		   case 2:
			   for(int i=1;i<=num;i++) {
				   if(i%5==0)
					   System.out.println("divisible by 5=="+i);
			  
			   }
			   break;
			   default:System.out.println("invalid choice");
			   
			   
		}
		
		
	}
}
