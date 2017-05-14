package hell;

public class School implements Information
{
	public String getdetails()
	{
	System.out.println("inforamation of teacher");
	System.out.println("details of teacher");
	String name= "ctk_matric_school";
	int id=2001;
	return name+id;

	}
	public String getaddress()
	{
	System.out.println("address of teacher");
	String address="3/5,mgr street, tnagar";
	return address;
	}



}
