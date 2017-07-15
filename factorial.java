package hell;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		
		int i,factorial=1,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of number");
		number=sc.nextInt();
		for(i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
	System.out.println("the factorial value is" +factorial);	
	}

}
