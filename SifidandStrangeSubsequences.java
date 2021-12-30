import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class SifidandStrangeSubsequences
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i<n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			int count = 0;
			int countminnegdiff = 0;
			int minnegdiff = 2000000001;
			for(int i = 0; i<n; i++)
			{
				if(a[i]<=0)
				{
					if(count>=1)
						if(Math.abs(a[i] - a[i-1]) < minnegdiff)
							minnegdiff = Math.abs(a[i] - a[i-1]);
					count++;
				}
				else break;
			}
			if(count<n && count == 1)
			{System.out.println(2);continue;}
			if(count == 0)
			{System.out.println(1);continue;}
			if(count<n && a[count] <= minnegdiff)
				count++;
			System.out.println(count);
		}
	}
}