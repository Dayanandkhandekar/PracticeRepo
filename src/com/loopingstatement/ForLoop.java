package com.loopingstatement;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		ForDemo obj =new ForDemo();
		obj.a();
		 obj.a1();
	  obj.a2();
		obj.a3();
		}
			}
class ForDemo {
	void a() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Display table of any number");
	int a = sc.nextInt();
	for(int i=1 ;i <=10; i++) {
		System.out.println(a+"*"+i+" = "+a*i);	
	}
	}
	 void a1() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Number 1 to 50 which are even ");
		 int b =50;
		 for(int i=1 ;i <=50; i++) {
			 if(i%2==0)
		 System.out.println(i);
		 }
	 }
	 void a2() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Number 1 to 50 which is divisble by 3");
		 int c =sc.nextInt();
		 for(int i=1 ;i <=50; i++) {
			 if(i%3==0);
		 System.out.println(i);
		 }
	 }
	 void a3() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Number 1 to 50 which divible by 3 and even");
		 int d =sc.nextInt();
		 for(int i=1 ;i <=50; i++) {
			 if(i%3==0 && i%2==0)
		 System.out.println(i);
 }
	 }
}
 
	

	 
 
 


		 
	 
 

