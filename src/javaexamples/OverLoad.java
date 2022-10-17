package javaexamples;

public class OverLoad {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b ,int c) {
		System.out.println(a+b+c);
	}
	public static void main(String args[]) {
		OverLoad aob = new OverLoad();
		aob.add(20, 20);
		aob.add(10, 10, 10
				);
	}

}
