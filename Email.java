package emailapp;

import java.util.Scanner;

public class Email {
  private String firstname;
  private String lastname;
  private String password;
  private String dept;
  private String email;
  private int mailboxCapacity = 500;
  private String alternateEmail;
  private int defaultpasswordLength = 10;
  private String companySuffix ="xyz.com";
  
  //Constructor to receive the first name and last name 
  public Email(String firstname, String lastname) {
	  this.firstname = firstname;
	  this.lastname = lastname;
	 // System.out.println("Email is Generated: " + this.firstname + " " + this.lastname );
	  
	  // Call a method of Department
	  this.dept = setDeptartment();
	  //System.out.println("Department : "+this.dept);
	  
	  // Call a method to return a random Password
	  this.password = randomPassword(defaultpasswordLength);
	  //System.out.println("Your password :- "+this.password);
	  
	  //Combine elements to generate email
	  email = firstname.toLowerCase() + "." + lastname.toLowerCase() +"@" + dept +"." + companySuffix; 
	  //System.out.println(" Your Email is :- " + email);
	  
  }
  //Ask of Department
  private String setDeptartment() {
	  System.out.println("Department code\n1 for Dev\n2 for Testing\n3 for BA\n0 for none\nEnter the code :");
	  Scanner sc=new Scanner("System.in");
	  int deptChoice = sc.nextInt();
	  if(deptChoice == 0) {
		  return "none";
	  }else if(deptChoice == 1) {
		  return "Dev";
	  }else if(deptChoice == 2) {
		  return "Testing";
	  }else {
		  return "";
	  }
  }
  
  //Generate a random password
  private String randomPassword(int length) {
	  String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
	  char [] password= new char[length];
	  for(int i=0; i<length; i++) {
		int rand = (int) (Math.random() *passwordSet.length());
		password[i] =passwordSet.charAt(rand);
//		System.out.println(rand);
//		System.out.println(passwordSet.charAt(rand));
	  }
	  return new String(password);
  }
  
  //MailBox Capacity
  public void setMailBoxCapacity(int capacity) {
	  this.mailboxCapacity = capacity;
  }
  public int getMailBoxCapacity() {
	  return mailboxCapacity;
  }
  
  // alternate email
  public void setAlternetEmail(String altEmail) {
	  this.alternateEmail = altEmail;
  }
  public String getAlternetEmail() {
	  return alternateEmail;
  }
  
  //Change password
  public void changePassword(String password) {
	  this.password = password;
  }
  public String getPassword() {
	  return password;
  }
  
  public String showInfo() {
	  return "Display Name :- " + firstname +" " + lastname +
			  "Comapny EMail :-" + email + 
			  "MAilBox :- " + mailboxCapacity + "mb" ;
  }
}







