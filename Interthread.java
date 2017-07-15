package hell;
class MyClass
{
	int data;
	boolean a=false;

	synchronized void getData() throws InterruptedException{
		while(!a){
		notify();
		System.out.println("Got data by : = "+data);
		wait();
		a=false;}
	}

	synchronized void setData(int data) throws InterruptedException {
		while(!a){
		this.data = data;
		notify();
		System.out.println("Data set with value : "+data);
		wait();
		a=false;}
	}
	
}

class Producer implements Runnable
{
	MyClass obj;
	int d=1;
	public Producer(MyClass obj) {

		this.obj=obj;
		//new Thread(this,"ProducerThread").start();
	}
	
	@Override
	public void run() {
	d=d+1;
		try {
			obj.setData(d);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class Consumer implements Runnable
{
	MyClass obj;
	
	public Consumer(MyClass obj) {
		this.obj=obj;
	}
	
	@Override
	public void run() {
	
		try {
			obj.getData();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class Interthread {

	public static void main(String[] args) {
		
		MyClass ob=new MyClass();
		Producer p=new Producer(ob);
		Consumer c=new Consumer(ob);
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		
		
	}
}

