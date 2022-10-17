package javaexamples;

public class OverRide1 extends OverRaiding{
	public void sub(int a ,int b)
	{
		System.out.println(a-b);
	}
		public static void main(String args[])
		{
			
			 OverRide1 a=new OverRide1();
				 a.sub(50,20);
			 }

}
