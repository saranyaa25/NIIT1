package hell;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		int middle,begin=0,end,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		int length=name.length();
	end=length-1;
	middle=(begin+end)/2;
		for(i=begin;i<=middle;i++)
		{
			if(name.charAt(begin)==name.charAt(end))
					{
				begin++;
				end--;
				
					}
			else
			{
				break;
			}
			}
			if(i==middle+1)
			{
				System.out.println("this is a palindrome");
				
			}
			else
			{
				System.out.println("not a palindrome");
			}
		

		
	}	
	}
