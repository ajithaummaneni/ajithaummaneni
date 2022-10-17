package javaexamples;

// SingleLevelMethod 
class A {
	public void  test () {
	System.out.println("Hello every one....");
	System.out.println("parent class features");
	System.out.println("same class,same method, differr signature");	
	
	}

}
public class B extends A {
	public void test12() {
		
		System.out.println("Print B");
	}
	public static void main(String[] args) {
		
		B b = new B();
		b.test();
		b.test12();
	}
	
}