package hell;

public class Student implements Information
{
	public String getdetails()
	{
	System.out.println("inforamation of student");
	System.out.println("details of student");
	String name=" kaviya";
	int id=1677;
	return name+id;
	}
	public String getaddress()
	{
	System.out.println("address of student");
	String address="8/6, abc street, tnager";
	
	return address;
	}
}


