package hell;

public class Thread_run implements Runnable
{
	public void run()
	{
	for(int i=0;i<20;i++)
	{
		System.out.println("thread" +i );
	}
	}
	public static void main(String[] args)
	{
		Thread_run g1=new Thread_run();
		Thread t1=new Thread(g1);
		
		t1.start();
	}
	

}




