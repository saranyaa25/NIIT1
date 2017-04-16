package functions;

public class Calculator {
	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum="+sum);
		
	}
void sub(int a,int b)

{
	int sub=a-b;
	System.out.println("sub="+sub);
	
}
int mul(int a,int b)
{
	int mul=a*b;
	return mul;
}
public static void main(String[] args) {
	Calculator c1=new Calculator();
	c1.add();
	c1.sub(10, 20);
	
	int mul=c1.mul(5, 2);
	System.out.println("mul="+mul);
	
	
}
}

