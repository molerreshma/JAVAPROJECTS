package teachpack;
import java.util.Scanner;

public class Exams 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n=sc.nextInt();
		System.out.println("Enter the marks of students");
		int arr[]=new int[n];
	     
   	    for(int i=0;i<n;i++)
   	    {
   		 arr[i]=sc.nextInt();
   	    }
   	    System.out.println("The priority of marks is");
   	     int temp=0;
   	     for(int i=0;i<n;i++)
   	        {
   	    	for(int j=i;j<n;j++)
   		      {
   			 if(arr[i]<arr[j])
   			    {
   				 temp=arr[i];
   				 arr[i]=arr[j];
   				 arr[j]=temp;
   			    }
   			 
   		      }
   System.out.println(arr[i]);
   	 
          }
    }
	   }
