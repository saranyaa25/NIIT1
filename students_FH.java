package hell;
import java.io.*;
import java.util.Scanner;
public class students_FH

{
	public static void main(String[] args) throws IOException  {
		FileWriter out =new FileWriter("student.txt");
		System.out.println("enter no of students");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("student no" +i);
		out.write("\n student no" +i);
		System.out.println("roll no");
		int roll=sc.nextInt();
		out.write("\n roll no=" +roll);
		System.out.println("student name");
		String sname=sc.next();
		out.write("\n student name" +sname);
		
	}
		out.flush();
		out.close();
		System.out.println("registeration is done");
	}
}
