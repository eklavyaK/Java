import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class HistogramUgliness
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n+2];
			for(int i = 1; i<=n; i++)
				a[i] = sc.nextInt();
			long k = 0;
			long result = 0;
			for(int i = 1; i<n+1; i++)
			{
				if(a[i]>a[i-1] && a[i]>a[i+1])
				{k = k + a[i] - Math.max(a[i-1],a[i+1]); a[i] = Math.max(a[i-1],a[i+1]);i++;}
			}
			for(int i = 1; i<n+2; i++)
				result = result + Math.abs(a[i] - a[i-1]);
			System.out.println(result+k);	
		}
	}
}