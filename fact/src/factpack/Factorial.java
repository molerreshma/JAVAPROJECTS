package factpack;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args)
	{
		
      int n;
      int sum=0,fact=3;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
    	  sum=fact*i;
      }
      System.out.println("The sum is:"+sum);
	}

}

