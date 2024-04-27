package Vinopackage;


public class Vinocorejava {
	
public void price(int amount, int quantity)

{
	int totalamount = amount*quantity;
	System.out.println(totalamount);
}
	
public void invoice(int amount, int quantity, double discountpercentage)

{
	int invoice = amount*quantity;
	double discount = DiscountAmount(invoice,discountpercentage);
	double total = Remaningamounttopay(invoice,discount);
	
			
}

	public static void main(String[] args)
	{
		System.out.println("vinod");
	    System.out.println("B.com");
	    System.out.println("8870431383");
		System.out.println("chennai");
		
		System.out.print("vinod");
	    System.out.print("B.com");
	    System.out.print("8870431383");
		System.out.println("chennai");
		Vinocorejava FC =new Vinocorejava();
		FC.price(100,2);
		FC.discount(10,5);
		
	
	}	

}
