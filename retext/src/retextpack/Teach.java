package retextpack;
import java.util.Scanner;
public class Teach 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the marks of students");
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<45)
			{
				count++;
			}
		}
		System.out.println("Number of students appearing for retest:" +count);
		
	}

}
