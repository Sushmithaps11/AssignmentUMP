package com.qsp.test2809;

public class Main
{
  public static void main(String[] args)
  {
	  Account a1 = new Account();
		a1.setbal(200000.0);
		System.out.println("Current Balance In Account : " + a1.getbal());
		
		
		OnlinePayment o1 = new OnlinePayment(30000.0,"OnePlus");
		o1.Addtocart(30000.0, "Oneplus Mobile");
		o1.Makepayment(30000.0, a1);
		
		
		 Laptops l1 = new Laptops("ump2011","Banglore",9945269620l,"Ulivesh",50000.0);
		    l1.Laptops("HP", 50000.0);
		    
		    
		    Mobiles m1 = new Mobiles("ump2011","Banglore",9945269620l,"Ulivesh",50000.0);
		    
	  
	
}
}
