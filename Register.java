package hell;
import java.util.Scanner;

public class Register
{
	void reg()
		{
		Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
	
	System.out.println("enter the candidate");
	String name=sc.next();
	System.out.println("enter the roll no");
	int roll_no=sc.nextInt();
	System.out.println("enter the password");
	int password=sc.nextInt();
	}
	}
	void display()
	{
		System.out.println("the candidate name i s");
System.out.println("the roll no is");
System.out.println("the password is");
	}

public static void main(String[] args) {
Register obj1=new Register();
obj1.reg();
Register obj2=new Register();
obj2.display();


}
}