package com.qsp.test2809;

public class OnlinePayment 
{
	double productprice;
	String productname;
	
	public OnlinePayment(double productprice,String productname)
	{
		this.productprice = productprice;
		this.productname = productname;
	}
	
	public void Addtocart(double productprice, String productname)
	{
		this.productprice = productprice;
		this.productname = productname;
		System.out.println("Product Added to Cart is :" + productname + "," + productprice);
	}
	
	public void Makepayment(double productprice,Account a1)
	{
		if(a1.getbal() > productprice )
		{
			a1.setbal(a1.getbal()- productprice);
			System.out.println("Your order is Placed");
		}
		else
		{
			System.out.println("Insufficient Fund");
		}
	}
	
	
}
		
	


