package hell;
public class Area
{
	public static void main(String[] args)  
	{ 
		Area a1=new Area();
a1.rectangle(2,3);
a1.square(3);
a1.triangle(3,4);
	a1.circle(1);
	}
	void rectangle(int length,int breadth) 
	{
		double area=length*breadth;
System.out.println("area_of_rectangle=" +area);	
}
	void triangle(int height,int base)
	{
		double area=0.5*height*base;
		System.out.println("area_of_triangle=" +area);
	}
		void circle(int radius)
		
		{
			double pi=3.14;
			double area=pi*radius*radius;
			System.out.println("area_of_circle=" +area);
		}
		void square(int side)
		{
			int area=side*side;
			System.out.println("area_of_square=" +area);	
		}
		} 	
	
	
