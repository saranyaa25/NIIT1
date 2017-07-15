package hell;

import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class StudentArray {
	
	String name;
	int id;
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		StudentArray[] arr=new StudentArray[4];
		 
		for(int i=0;i<4;i++)
		{
			arr[i]=new StudentArray();
			System.out.println("enter name : ");
			arr[i].name=scan.next();
			System.out.println("enter id :");
			arr[i].id=scan.nextInt();
		}
		
	
	
		for(int i=0;i<4;i++)
		{
			System.out.println("Details of student "+(i+1));
			System.out.println("Name :" +arr[i].name);
			System.out.println("Id :" +arr[i].id);
		}
		
	
	}

}
