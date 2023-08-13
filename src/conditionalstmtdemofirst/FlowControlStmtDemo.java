package conditionalstmtdemofirst;

public class FlowControlStmtDemo {
    int m1() {
    	
    	 return 10;
    	
    }
    
   static  void breakDemo() {
    	
    	for(int i=1; i<=10; i++) {
    		 if(i==5)
    			 break;
    		 System.out.println("i=="+i);
    	}
    	
    }
   
   static  void continoueDemo() {
   	
   	for(int i=1; i<=10; i++) {
   		 if(i==5)
   			continue;
   		 System.out.println("i=="+i);
   	}
   	
   }
   
   
   public static void main(String[] args) {
	   continoueDemo();
}
}
