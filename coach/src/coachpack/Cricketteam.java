package coachpack;
import java.util.Scanner;
public class Cricketteam
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of bowlers");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the runs conceded by the bowlers");
		 for(i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("Enter the number of balls for each bowler");
		int arr2[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Economy of the bowlers is");
		int arr3[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The overall economy of the team is");
		System.out.println("The number of bowlers elgible are");
		}

	}
