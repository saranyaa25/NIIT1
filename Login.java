package hell;
import java.util.Scanner;
public class Login extends Registeration_form
{
	String username,password;
	void login()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the username");
 username=sc.next();	
	System.out.println("enter the password");
	 password=sc.next();
	
	}
	void validata()
	{
		String username1=fname+lname;	
		int s1=username.compareTo(username1);
		int s2=password1.compareTo(password);
		if(s1==0 && s2==0) 
		{
			
		System.out.println("login successful");	
	}
		else
		{
			System.out.println("incorrect input");
		}
}
	public static void main(String[] args)
	{
	Login obj1=new Login();
	obj1.register();
	obj1.display();
	obj1.login();
obj1.validata();
	
}
	}