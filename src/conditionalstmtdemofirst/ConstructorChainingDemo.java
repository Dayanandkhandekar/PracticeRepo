package conditionalstmtdemofirst;

public class ConstructorChainingDemo {
public static void main(String[] args) {
	b a1=new b();
}
}
class A{
	int a;
	int b;
	public  A () {
		this(10);
		System.out.println("inside no arg A");
	}
	public  A(int a) {
		this(10,20);
		System.out.println("inside single para A");
	}
	public  A (int a,int b) {
		System.out.println("inside two para A");
	}
}


class b extends A {
	void m1(){
		super.a=10;
	}
	public b() {
		this(10);
		System.out.println("inside no arg b");
	}
	public b (int a) {
		super();
		System.out.println("inside single para b");
	}
}