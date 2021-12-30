import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class PairProgramming
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int k = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];
			int result[] = new int[n+m];
			for(int i = 0; i<n; i++)
				a[i] = sc.nextInt();
			for(int i = 0; i<m; i++)
				b[i] = sc.nextInt();
			int tracka = 0;
			int trackb = 0;
			int detect = 0;
			for(int i = 0; i<n+m; i++)
			{
				if(tracka<n && a[tracka]==0)
				{result[i] = 0; tracka++; k++;}
				else if(trackb<m && b[trackb]==0)
				{result[i] = 0; trackb++; k++;}
				else if(tracka<n && a[tracka]<=k)
				{result[i] = a[tracka]; tracka++;}
				else if(trackb<m && b[trackb]<=k)
				{result[i] = b[trackb]; trackb++;}
				else{detect = 1; break;}
			}
			if(detect == 1)
				System.out.println(-1);
			else
			{
				for(int i = 0; i<n+m; i++)
					System.out.print(result[i]+" ");
				System.out.println();
			}
		}
	}
}