package hell;

import java.util.Scanner;

public class Armstrong {

		public static void main(String[] args) {
		int temp,c=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
	      //  int n=153;		
			temp=n;
			while(n>0)
			{
				a=n%10;
				n=n/10;
				c=c+(a*a*a);
				
			}
	if(temp==c)	
	{
		System.out.println("this is armstrong number");
		
	}
	else
	{
		System.out.println("not a armstrong number");
	}
		}

	}



