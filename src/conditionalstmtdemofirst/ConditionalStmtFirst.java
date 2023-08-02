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
	 
	 //IfDemoFirstSecond.m5();
	 
	 //IfDemoFirstSecond.m6();
	 
	 //IfDemoFirstSecond.m7();
	 
	 //IfDemoFirstSecond.m8();
	 
	//IfDemoFirstSecond.m9();
	
	IfDemoFirstSecond.m10();
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
			 if (num3 % 2==0) { 
				    System.out.println("the first no is even");}
				    
				    else {
				    System.out.println("the first no is odd");}
					

		}
	}
	
	static void m6() {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Enter no");
		 
		 int num5 = sc.nextInt();
		 
		 int number = 0,count = 1;
		 
		 System.out.println("select opt");
		 System.out.println("1. The given no is even or odd");
		 System.out.println("2.It is a prime no");
		 System.out.println("3.The given no is divisible by 7");
		 System.out.println("4.The given no is between 10 to 20");
		
		 
		 int opt=sc.nextInt();
		 
		 switch (opt) {
		     case 1:
		    	 if (num5 % 2==0) { 
					    System.out.println("The given no is even");
					    }
		    	 else {
					    System.out.println("The given no is odd");
					    }
				break;
				
		     case 2:
		    	 if(count==0 && number !=1)
		    	 {
		    		 System.out.println("It is a prime no");
		    	 }
		    	 else {
		    		 System.out.println("It is not a prime no");
		    	 }
		         break;
		 
		     case 3 :
		    	if(num5 % 7 == 0)
		    		{
		    		System.out.println("The given no is divisible by 7");
		    		}
		    	else {
		    		System.out.println("The given no is not divisible by 7");
		    	}
		    	break;
		    	
		     case 4 :
			    if(num5> 9 && num5< 21) {
			    	System.out.println("The given no is between 10 to 20");
			    }
			    else {
			    	System.out.println("The given no is not between 10 to 20");
			    }
		    	break;
		    	
			    default :System.out.println("Invalid choice");
		    	
		    	
		 }
	}
		 
	static void m7() {
           //table of any no
         Scanner sc = new Scanner(System.in);  
         System.out.print("Enter number: ");       

                 int abc=sc.nextInt();  

                   for(int i=1; i <= 10; i++)  
{  
     
             System.out.println(abc+" * "+i+" = "+abc*i);  
}  
}  
	
	static void m8() {
		// 1-50 even no
          System.out.println("The first 50 even no");
           
          int num=50;
          for(int i=1;i<=50;i++) {
        	  if(i%2==0) {
        		  System.out.println(i);
        	  }
          }
          

}  
	
	static void m9() {
		// 1-50 divisible by 3 no
        System.out.println("The divisible by 3 no");
        
        int num=50;
        for(int i=1;i<=50;i++) {
      	  if(i%3==0) {
      		  System.out.println(i);
      	  }

	}
	}
	

     static void m10() {
	// 1-50 even no and divisible by 3 no
            System.out.println("The  even no and divisible by 3 no");
    
         int num=50;
         for(int i=1;i<=50;i++) {
  	         if(i%2==0 && i%3==0) {
  		    System.out.println(i);
  	  }

         }
     }
     }
     
		   
		         
	

		        
		     

	
		
		
			
	
	
	
	
	
	
	
	
	
	
	