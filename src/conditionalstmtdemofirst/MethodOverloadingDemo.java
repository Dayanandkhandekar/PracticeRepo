package conditionalstmtdemofirst;

public class MethodOverloadingDemo {
public static void main(String[] args) {
	
}
       byte num1=10;
       int num2=num1;//convert byte to int it is a implicit casting
       
       int num3=10;
       byte num4=(byte) num3;//convert int to byte it is a explicit casting
       
       MethodOverloading a1=new MethodOverloading();//object create kela
       byte b = 10;
     //  a1.add();

       // Calling sequence in Method Overloading
	   // Exact match
	   // Implicit vala rule
	   // Check related wrapper class
	   // Parent ---- parent --- object class parent janar
}

class MethodOverloading {
	   
    void add(){ 
     System.out.println("==Inside No para===");
   }

    
 int add(int a){ // Implicit vala rule
	 System.out.println("==Inside Single int  para===");
	return a;//int type value return keli 

  }

    void add(int a,int b){
    	System.out.println("==Inside Double int  para===");
   }

    
  void add(byte b){ // Check related wrapper class
	  System.out.println("==Inside Single byte  para===");
 }

 void add(Integer a){
	 System.out.println("==Inside Single Integer  para===");

    }
 
 void add(Byte a){ // Exact match
	 System.out.println("==Inside Single Byte  para===");

    }
    
  void add(Number a){//parent class search
	  System.out.println("==Inside Single Number  para===");
  }
 


 void add(Object a){//after parent....parent.....object class search
	 System.out.println("==Inside Single Object  para===");
 
}

}
