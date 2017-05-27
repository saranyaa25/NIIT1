package hell;

import java.util.Scanner;
public class Registeration_form

{
	String lname, fname,password1;
		void register()
			{
			Scanner sc=new Scanner(System.in);
		{
		
		System.out.println("enter the first name");
		fname=sc.next();
		System.out.println("enter the last name");
		lname=sc.next();
		System.out.println("enter the password");
		 password1=sc.next();
		}
		}
		void display()
		{
		
	System.out.println("the username is" +fname +lname );
	System.out.println("the password is *****");
	System.out.println("registeration completed");
		}
		

}

