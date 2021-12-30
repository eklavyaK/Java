import java.util.Scanner;
import java.util.Arrays;
public class GCDproblem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = sc.nextLine();
		while(t-->0)
		{
			int n = sc.nextInt();
			if(n%2==0)
				System.out.println(n/2+" "+(n-2)/2+" "+1);		
			else if(((n+1)/2)%2==0)
				System.out.println(((n+1)/2-3)+" "+((n-1)/2+2)+" "+1);
			else
				System.out.println(((n+1)/2-2)+" "+((n-1)/2+1)+" "+1);
		}
	}
}