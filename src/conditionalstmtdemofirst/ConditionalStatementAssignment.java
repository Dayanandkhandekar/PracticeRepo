package conditionalstmtdemofirst;

public class ConditionalStatementAssignment {
public static void main(String[] args) {
	//IfDemo.m1();
	//IfDemo.m2();
	//IfDemo.m3();
	//IfDemo.m4();
	//IfDemo.m5();
	IfDemo.m5();
	
}
}
class IfDemo {
	 static void m1() {
		// 1-100 even no using for loop
         System.out.println("The first 100 even no");
          
         int num=100;
         for(int i=1;i<=100;i++) {
       	  if(i%2==0) {
       		  System.out.println(i);
       	  }
         }
	 }
	static void m2() {
			// 1-100 even no using while loop
	        System.out.println("The first 100 even no");
	         
	        int num=100;
	              int i=1;
	              while(i<=100) {
	      	  if(i%2==0) 
	      		  System.out.println(i);
	      		  i++;
	      	  }
	}
	static void m3() {
			// 1-100 even no using do while loop
	        System.out.println("The first 100 even no");
	         
	        int num=100;
	              int i=1;
	              do{
	      	  if(i%2==0) 
	      		  System.out.println(i);
	      		  i++;
	      	  }while(i<=100);
		} 
	 static void m4() {
			// 100-1 odd no using for loop
         System.out.println("The 100 to first odd no");
          
        
         for(int i=100;i>=1;i--) {
       	  if(i%2!=0) {
       		  System.out.println(i);
       	  }
         }
	 }
	 static  void m5() {
			// 100-1 odd no using while loop
	          System.out.println("The 100 to first odd no");
	           
	    
         int i=100;
         while(i>=1) {
 	  if(i%2!=0) 
 		  System.out.println(i);
 		  i--;  
         }
     }
	 static void m6() {
	 
			// 100-1 odd no using do while loop
			System.out.println("The 100 to first odd no");
			
			int i=100;
			do {
				if(i%2!=0) 
		      		  System.out.println(i);
		      		  i--;
			}while(i>=1);
		 }

	 
	 
}	 
	 

      