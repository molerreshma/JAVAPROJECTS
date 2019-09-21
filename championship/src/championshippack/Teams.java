package championshippack;
import java.util.Scanner;
public class Teams
{
	public static void main(String[] args)
	{
		
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of players");
n=sc.nextInt();
System.out.println("Enter the name of fouls made by each player");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}

	}

}
