package com.qsp.test1609;

public class Laptop
{
	String Laptopid;
	String model;
	int year;
	String processor;
	int ramsize;
	double price;
	static int n = 10;
	
	public Laptop(String Company ,String model,int year ,String processor,int ramsize,double price)
	{
		this.model=model;
		this.year=year;
		this.processor=processor;
		this.ramsize=ramsize;
		this.price=price;
		this.Laptopid=Company+year+model+0+n++;
	}
	public void Lapidetials()
	{
		System.out.println(Laptopid);
		System.out.println(model);
		System.out.println(year);
		System.out.println(processor);
		System.out.println(ramsize);
		System.out.println(price);
	}
	public static void main(String[] args) 
	{
		Laptop ump = new Laptop("Del","La",2023,"I7",8,60000.0);
		ump.Lapidetials();
		
		Laptop smp = new Laptop("Del","La",2022,"I5",8,50000.0);
		smp.Lapidetials();
		
	}

}
