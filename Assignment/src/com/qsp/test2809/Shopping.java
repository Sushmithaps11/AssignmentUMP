package com.qsp.test2809;

public class Shopping 
{
	String username;
	String address;
	long phonenumber;
	String name;
	double price;
	
	public Shopping(String username,String address,long phonenumber,String name,double price)
	{
		super();
		this.username = username;
		this.address = address;
		this. phonenumber = phonenumber;
		this.name = name;
		this.price = price;
	}
	
	public void Buynow(String productprice , OnlinePayment o1, Account a1)
	{
		
	}
}

class Mobiles extends Shopping
{
	public Mobiles(String username,String address,long phonenumber,String name,double price)
	{
		super( username,address,phonenumber,name,price);
	}
	
	
}

class Laptops extends Shopping
{
	public Laptops(String username,String address,long phonenumber,String name,double price)
	{
		super( username,address,phonenumber,name,price);
	}

	public void Laptops(String string, double d) {
		// TODO Auto-generated method stub
		
	}
	
	
}



