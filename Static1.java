package static1;

public class Static1
{  
	static int i=90;  
	int j=20;   
	public static void main (String [ ] args) 
	{  
	System.out.print(Static1.i);
	
		Static1 obj1= new Static1 ( );   
	System.out.println(i);
		
		obj1. j=30;  
		Static1 obj2=new Static1 ( );
		
		System.out.println(obj2.j);
System.out.println(obj1.j);

		}
	} 

