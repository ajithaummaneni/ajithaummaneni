package javaexamples;


abstract class Bank
{
	abstract void debit();
	abstract void credit();
}


 class Hdfc extends  Bank {
	 public void debit()
	 {
		System.out.println("DEBIT ALL TRASACTION MUST BE PRINTED");
		 
	 }
	 public void close()
	 {
		 System.out.println(" ALLCREDIT TRNSACTION SHOULD BE PRINTED");
	 }
 
 

	public static void main(String[] args) {
		Hdfc hd=new Hdfc();
		
hd.close();
hd.debit();
	}
	@Override
	void credit() {
		// TODO Auto-generated method stub
		
	}
	}
	
