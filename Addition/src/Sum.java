
import java.util.Scanner;
public class Sum 
{
	
	int a,b;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int sum1() {
		int ans = this.getA() + this.getB();
		return ans;
	}
	
	public static void main(String[] args) {
		int a,b;
		Sum s1 = new Sum();
		Scanner S=new Scanner(System.in);
		a=S.nextInt();
		s1.setA(a);
		b=S.nextInt();
		s1.setB(b);
	  
		System.out.println(" the sum is "+ s1.sum1());
	  
	}
}
