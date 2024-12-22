package com.qsp.inheritance;


class Account 
{
	long accno;
	String name;
	double bal;
	String ifsc;
	
	public Account (long accno,	String name,double bal,String ifsc)
	{
		this.accno=accno;
		this.name=name;
		this.bal=bal;
		this.ifsc=ifsc;
	}
	
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("Deposited Amt :" + amt + "Current Bal :" + bal);
	}
	
	public void withdraw(double amt)
	{
		bal=bal-amt;
		System.out.println("Withdraw Amt :" + amt + "Current Bal :" + bal);
	}
	public void display()
	{
		System.out.println(accno);
		System.out.println(name);
		System.out.println(bal);
		System.out.println(ifsc);
	}
	
}

class Savings extends Account
{
	double roi;
	
	public Savings(double roi,long accno,String name,double bal,String ifsc)
	{
		super(accno,name,bal,ifsc);
		this.roi=roi;
	}
	public void calculateROI()
	{
		bal = bal+bal*0.5;
		System.out.println("Bal With ROI " + bal);
	}
}

class Current extends Account 
{
	double minbal;
	
	public Current(double minbal,long accno,String name,double bal,String ifsc)
	{
		super(accno,name,bal,ifsc);
		this.minbal = minbal;
	}
	public void showminbal()
	{
		System.out.println("Min balance is " + minbal);
	}
	
}
public class Main 
{
	public static void main(String[] args) 
	{
		Current ump = new Current(4000.0,45587468l,"Ump",50000.0,"SBI456611");
		ump.showminbal();
		ump.deposit(5000.0);
		ump.withdraw(2000.0);
		ump.display();
		
		System.out.println("-------------------------------------------");
		
		Savings smp = new Savings(0.5,788261651l,"Smp",40000.0,"SBI74545418");
		smp.deposit(4000.0);
		smp.withdraw(2000.0);
		smp.calculateROI();
		smp.display();
	}

}
