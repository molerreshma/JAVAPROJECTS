package transportpack;
import java.util.Scanner;
public class Applications
{

	public static void main(String[] args)
	{
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of applications");
		n=sc.nextInt();
		System.out.println("Enter the amounts (in crores)");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int crores =sum/n;
		System.out.println("The binning bid is:" +crores);
		

	}

}
