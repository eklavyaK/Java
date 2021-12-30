import java.util.Scanner;
import java.util.Arrays;
public class PolycarpandSumofSubsequences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int a[] = new int[7];
			for(int i=0; i<7; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			System.out.println(a[0]+" "+a[1]+" "+(a[6] - (a[0]+a[1])));
		}
	}
}