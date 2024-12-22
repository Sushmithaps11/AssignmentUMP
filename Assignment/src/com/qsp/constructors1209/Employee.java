package com.qsp.constructors1209;

public class Employee 
{
	String Name;
	String EmpId;
	double Sal;
	String Exp;
	
	public Employee(String Name , String EmpId , double Sal, String Exp )
	{
		this.Name = Name;
		this.EmpId = EmpId;
		this.Sal = Sal;
		this.Exp = Exp;
	}
	public void Displaydetials()
	{
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Sal);
		System.out.println(Exp);
	}
	public void UpdateSal(double Sal)
	{
		this.Sal = Sal;
		System.out.println("Updated Sal :" + Sal);
	}
	public void ChangeExp(String Exp)
	{
		this.Exp = Exp;
		System.out.println("Changed Exp :" + Exp);
	}
	public static void main(String[] args) 
	{
		Employee ump = new Employee("Ump","US2011",25000.0,"4Yrs");
		ump.Displaydetials();
		ump.UpdateSal(30000.0);
		ump.ChangeExp("5Yrs");
		
		Employee smp = new Employee("Smp","AB2000",30000.0,"3Yrs");
		smp.Displaydetials();
		smp.UpdateSal(35000.0);
		
	}

}
