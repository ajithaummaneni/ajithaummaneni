package javaexamples;

interface WebDriver 
{
	public  void openApp();
	public  void closeApp();	
}
class FirefoxDriver implements WebDriver
{
	
	public void  openApp()
	{
		System.out.println("open FirefoxDriver");
	}
	public void closeApp ()
	{
		System.out.println("close FirefoxDriver ");
	}

//
//public class FirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver ff=new FirefoxDriver();
		ff.openApp();
		ff.closeApp();

		
	}

}
