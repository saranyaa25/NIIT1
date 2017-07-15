package hell;

public class Synchronise implements Runnable {
	public synchronized void run()
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
     Thread t2=new Thread(g1);
			t2.start();
			Thread t3=new Thread(g1);
			
			t3.start();
}
			}
	

		
		
	


