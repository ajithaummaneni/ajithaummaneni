package javaexamples;
public class ExceptionHandArray
{
	public static void main(String[] args)
	{
		try
		{
			int a[]= { 1,2,3,4,5,0};
			System.out.println(a[10]);
		}
		catch(Exception e) {
		
			System.out.println(e);
			
			
			
		}
		
	}
}


