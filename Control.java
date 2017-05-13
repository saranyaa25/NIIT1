package hell;

public class Control {
	public static void main(String[] args) {
		Two_wheeler t1=new Two_wheeler();
		System.out.println(+t1.getcost());
		System.out.println(+t1.getspeed());
		Three_wheeler h1=new Three_wheeler();
		System.out.println(+h1.getcost());
		System.out.println(+h1.getspeed());
		Four_wheeler f1=new  Four_wheeler();
		System.out.println(f1.getcost());
		System.out.println(f1.getspeed());
	
	}
}