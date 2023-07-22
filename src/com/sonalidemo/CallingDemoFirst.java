package com.sonalidemo;

public class CallingDemoFirst {

}
class slm
{
	int s;//instance variable
	static int c;//static variable
	void m1(){//instance method
		int e;
		System.out.println("s===="+s);//instance variable access in instance method class same
		System.out.println("c===="+c);//static variable access in instance mathod because static field la memory class loading la bhetali
		
	}
	static void m2() {//static method
		slm obj=new slm();//object create for instance field memory
		System.out.println("c===="+c);//static variable access in static mathod because static field la memory class loading la bhetali
		System.out.println("s===="+obj.s);//instance field la access kru shakto ata static method madhe
		
	}
	{
		int k;//instance block
		System.out.println("s===="+s);//instance variable access in instance block memory already bhetali
		System.out.println("c===="+c);//static variable access in instance block memory already bhetali
		
		 System.out.println("Inside instance block");
		 }
		 
		 static{
			 System.out.println("Inside static block");
			 slm obj=new slm();//object create for instance field for memory
			 System.out.println("c===="+c);//static variable access in static block memory class loading chya veles bhetali
			 System.out.println("s==="+obj.s);//instance variable access in static block after object creating
			 	
	}
		 class Pqr{
				
				int aa;
				static int bb;
				
				void m3() {//instance method
					 slm obj=new slm();//object create for instance method
					 System.out.println("c==="+slm.c);//static variable access in instance method class chya navani
					 System.out.println("s==="+obj.s);//instance variable access in instance method object create kelyavr memory bhetali
					 int w;
				 }
				 
				 static void m4() {//static method
					 slm obj=new slm();//object create for instance method
					 System.out.println("c==="+slm.c);//static variable access in instance method class chya navani
					 System.out.println("s==="+obj.s);//instance variable access in instance method object create kelyavr memory bhetali
				 }
				 {
					 
					 System.out.println("Inside instance block");
				 }
				 
				 static{
					 System.out.println("Inside static block");
				 }
		 }
}
		 
		 
		 
		 
		 
		 
		 