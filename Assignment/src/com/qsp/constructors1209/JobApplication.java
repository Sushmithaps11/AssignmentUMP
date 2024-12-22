package com.qsp.constructors1209;

public class JobApplication 
{
 String Name;
 String Email;
 long Mobile;
 double Tenth;
 double Twelth;
 double Degree;
 
 public JobApplication(String Name , String Email, long Mobile , double Tenth , double Twelth , double Degree)
 {
	 this.Name = Name;
	 this.Email = Email;
	 this.Mobile = Mobile;
	 this.Tenth = Tenth;
	 this.Twelth = Twelth;
	 this.Degree  =Degree;
 }
 
 public void displaydetials()
 {
	 System.out.println(Name);
	 System.out.println(Email);
	 System.out.println(Mobile);
	 System.out.println(Tenth);
	 System.out.println(Twelth);
	 System.out.println(Degree);
 }
 
   public static void main(String[] args) 
   {
    JobApplication ump = new JobApplication("Ulivesh","ump2011@gmail.com",9945269620L,87.5,88.5,82.0);
    ump.displaydetials();
    JobApplication smp = new JobApplication("Soumya","smp10@gmail.com",787454121L,94.0,89.5,82.0);
    smp.displaydetials();
    
}
}
