package com.qsp.test1609;

public class Customer 
{
	String name;
	long phoneno;
    String emailid;
    String pwd;
    
    public Customer(String name,long phoneno,String emailid,String pwd)
    {
    	this.name=name;
    	this.phoneno=phoneno;
    	this.emailid=emailid;
    	this.pwd=pwd;
    }
    
    public void Customerdetials()
    {
    	System.out.println(name);
    	System.out.println(phoneno);
    	System.out.println(emailid);
    	System.out.println(pwd);
    }
    
    public void Login()
    {
    	if(emailid =="ump@gmail.com" && pwd =="ump@11")
    	{
    		System.out.println("Login Successfull");
    	}
    	else
    	{
    		System.out.println("Invalid Detials");
    	}
    }
    
    public static void main(String[] args) 
    {
    	Customer ump = new Customer("Ump",654984632l,"ump@gmail.com","ump@11");
    	ump.Customerdetials();
    	ump.Login();
    	
    	Customer smp = new Customer("Smp",787946112l,"smp@gmail.com","smp@10");
    	smp.Customerdetials();
    	smp.Login();
		
	}
    
    

}
