package leappack;
import java.util.Scanner;
public class Year 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		n=sc.nextInt();
		if(n%400==0 || (n%4==0 && n%100!=0))
		{
		System.out.println("it is a leapyear");
		}
		else
		{
	    System.out.println("it is not a leapyear");
		}
			
	}

}
