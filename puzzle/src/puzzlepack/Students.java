package puzzlepack;
import java.util.Scanner;
public class Students 
{
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
        	sum=n/n;
        }
        System.out.println("The divisors of the number are:"+sum);
	}

}
