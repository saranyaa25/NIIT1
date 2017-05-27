package hell;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class String_replace {
	
public static void main(String[] args) 
{  int count=0;
	String s1="acf52bgv25gfvh2";
	
	Pattern p1=Pattern.compile("\\d");
	Matcher m1=p1.matcher(s1);
	while(m1.find()){
		count++;
	}	
System.out.println("no of digits is=" +count);
s1=s1.replaceAll("\\d","#");
System.out.println(s1);
	
}

}
