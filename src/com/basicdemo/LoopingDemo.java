package com.basicdemo;

public class LoopingDemo {

	 static void forLoopDemo() {
		 int abc[]=new int[4];
		 abc[0]=10;
		 abc[1]=20;
		 abc[2]=30;
		 abc[3]=40;
		 
		 for(int i=1; i <=10;i++){
		       System.out.println(i);//1
		  }
		 
		 int total=0;
		 
		 for(int i=0; i< abc.length;i++){
		       System.out.println(i);//1
		       int a=abc[i];
		       total=total+a;
		  }
		 
		 System.out.println("total==="+total);//1

	 }
	
	 
	 public static void main(String[] args) {
		 forLoopDemo();
	}
	
}
