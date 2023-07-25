package conditionalstmtdemofirst;

import java.util.Scanner;

public class ConditionalStmtFirst {
public static void main(String[] args) {
	 IfDemoFirst obj = new  IfDemoFirst();
	 obj.m1();
	 
	 
	 IfDemoFirstSecond obj1 = new  IfDemoFirstSecond();
	 obj1.m2();
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
}