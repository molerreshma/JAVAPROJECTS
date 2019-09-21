package alphabetspack;

import java.util.Scanner;

public class Jambled
{
	
	public static void main(String[] args)
	{
       int n;
       int fact1=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number alphabets in your name");
       n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   fact1=fact1*i;
       }
       
       System.out.println("The number of combination is:"+fact1);
	}

}
