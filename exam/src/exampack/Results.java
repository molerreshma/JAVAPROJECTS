package exampack;
import java.util.Scanner;
public class Results
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		n=sc.nextInt();
		System.out.println("Enter the marks of students");
		int arr[]=new int[n];
   	    for(int i=0;i<n;i++)
   	    {
   		 arr[i]=sc.nextInt();
   	    }
   	    System.out.println("The average is");
   	     int sum=0;
   	     int avg;
   	     for(int i=0;i<n;i++)
   	        {
   	    	sum=sum+arr[i];
   	        }
   			 avg=sum/n;
   			System.out.println(avg);
   			 
	} 


}
