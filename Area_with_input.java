package hell;
import java.util.Scanner;
public class Area_with_input
{ 
	public static void main(String[] args)
	{
		Area_with_input obj=new Area_with_input();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height : ");
		int height=sc.nextInt();
		System.out.println("enter base : ");
		int base=sc.nextInt();
		System.out.println("enter side : ");
		int side=sc.nextInt();
		System.out.println("enter length : ");
		int length=sc.nextInt();
		System.out.println("enter breadth : ");
		int breadth=sc.nextInt();
		System.out.println("enter radius : ");
		float radius=sc.nextFloat();
		obj.circle(radius);
		obj.rectangle(length,breadth);
		obj.triangle(height,base);
	obj.square(side);
		} 
	void square(int side)
	{
	int area=side*side;
	System.out.println("the value of square = " +area);
}
	void triangle(int base,int height)
		{
		double area=0.5*height*base;
		System.out.println("the value of area of triangle = " +area);
	}
	
	void rectangle(int length,int breadth)
	{
		int area=length*breadth;
		System.out.println("the value of area of rectangle" +area);
	}
	void circle(float radius)
	{
	double pi=3.14;
				double area=pi*radius*radius;
			System.out.println("the area of circle = " +area);
		
	}
}
