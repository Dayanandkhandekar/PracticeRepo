package conditionalstmtdemofirst;

public class MethodOverriding {

}
class parent{
	void m1() {
		System.out.println("inside parent void");
	}
	int m2() {
		System.out.println("inside parent int");
		return 0;
	}
	 Integer m3() {
		System.out.println("inside parent integer");
		return null;
	}
	 Number m4() {
			System.out.println("inside parent number");
			return null;
}
	 parent m5() {
			System.out.println("inside parent parent");
			return null;
}
}
class child extends parent{
	void m1() {//same method name same parameter with parent child relationship
		System.out.println("inside child void");
   }
	int m2() {//in primitive case return type will be same after method overriding
		System.out.println("inside parent int");
		return 0;
	}
	 Integer m3() {//in wrapper class case return type will be same after method overriding
		System.out.println("inside parent integer");
		return null;
	 }
	 Number m4() {//primitive ,wrapper,void return nahi mg tech karu shakto kinva tyachya less kru shakto
			System.out.println("inside parent number");
			
			Number n=new Number() {
				
				@Override
				public long longValue() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int intValue() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public float floatValue() {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public double doubleValue() {
					// TODO Auto-generated method stub
					return 0;
				}
			};
			return n;
}
	 child m5() {//primitive ,wrapper,void return nahi mg tech karu shakto kinva tyachya less kru shakto
			System.out.println("inside parent parent");
			return null;
}
	 
	 //access modifier - parent madhe method cha jo access modifier asel toch access modifier 
	                     //ha child madhe asala pahijel kinva greater pahijel
	 
	 //sequence - private---> default---> protected----> public.
	 
	 
	 
	 
	 
	 
	 
}