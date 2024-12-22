package com.qsp.constructors1209;

public class Account 
{
	String Name;
	long Accno;
	String Branch;
	double Bal;
	String IFSC;
	static String BankName="SBI";
	
	public Account(String Name , long Accno , String Branch , double Bal ,String IFSC )
	{
		this.Name = Name;
		this.Accno = Accno;
		this.Branch = Branch;
		this.Bal = Bal;
		this.IFSC = IFSC;
	}
	
	public void Accountdetials()
	{
		System.out.println(Name);
		System.out.println(Accno);
		System.out.println(Branch);
		System.out.println(Bal);
		System.out.println(IFSC);
		System.out.println(BankName);
	}
	public void Deposit(double Amt)
	{
		if(Amt>0)
		{
			 Bal = Bal + Amt;
			System.out.println("Deposited By "+ Name+ "is :" + Amt + "Bal after Deposit :" + Bal );
		}
		else {
			System.out.println("Invalid Amt");
		}
	}
	public void Withdraw(double Amt)
	{
		if(Amt<Bal && Amt>0)
		{
			Bal = Bal - Amt;
			System.out.println("Withdrawed By :"+Name + "is :"+ Amt +"Bal after Withdraw :" + Bal);
		}
		else
		{
			System.out.println("Invalid Amt");
		}
	}
	public void CheckBal()
	{
		
		System.out.println("Bal :" + Bal);
	}
	public static void main(String[] args) 
	{
		Account ump = new Account("Ulivesh",9448922960L,"HKR", 10000.0,"SBIN00000260");
		ump.Accountdetials();
		ump.Deposit(5000.0);
		ump.Withdraw(2000.0);
		ump.CheckBal();
		
	}

}
