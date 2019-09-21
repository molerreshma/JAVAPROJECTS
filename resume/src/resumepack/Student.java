package resumepack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student
{
	
	public static void main(String[] args) throws IOException{
	{
		
		String name;
		String age;
		String degree;
		String branch;
		String contact_number;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name");
name=br.readLine();
System.out.println("Enter your Age");
age=br.readLine();
System.out.println("Enter your degree");
degree=br.readLine();
System.out.println("Enter your branch");
branch=br.readLine();
System.out.println("Enter your contact_number");
contact_number=br.readLine();

System.out.println("name:     "+name);
System.out.println("age:      "+age);
System.out.println("degree:   "+degree);
System.out.println("contact:  "+contact_number);
	}
	}
}
