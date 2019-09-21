package fibnoccacipack;
import java.util.Scanner;
public class Sum
{
	public static void main(String[] args) 
	{
	 int n,z,series,first,second;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
	 n=sc.nextInt();
	 System.out.println("The fibnocci series");
	 int a=0,b=1;
	 System.out.print(a);
	 System.out.println(b);
	 
	 
      for(int i=0;i<=n;i++)
      {
    	  z=a+b;
    	  a=b;
    	  b=z;
      System.out.println("The fibnocci series is:"+z);
	 }
	}
}
