package hell;
import java.util.Scanner;
public class Linear_search
{
	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int x[]=new int[n];
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println("enter the no" +i+ "\n");
			x[i]=sc.nextInt();
			
		}
		for (int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	
	
		System.out.println("enter the search key");
int searchkey=sc.nextInt();

for(int i=0;i<x.length;i++)
{
if(x[i]==searchkey)
{
	flag=1;
	System.out.println("the searchkey is found");
	System.out.println("present at location"	+(i+1)+ ".");

}
}
if(flag==0)
{
	System.out.println("not found.");
}

}

}	

