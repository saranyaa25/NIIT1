package hell;

public class Teacher implements Information
{
	public String getdetails()
	{
	System.out.println("inforamation of teacher");
	System.out.println("details of teacher");
	
	String name= "Ramya";
	
	int id=5627;
	
	return name+id;
	
	}
	public String getaddress()
	{
	System.out.println("address of teacher");
	String address="3/5, xyz street, tnager";
	
	return address;
	}
}

