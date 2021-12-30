import java.util.Scanner;
import java.util.Arrays;
public class PainttheArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int k=0, l=0, n = sc.nextInt();	
			int r = n%2;
			int r1 = (n+r)/2;
			int r2 = (n-r)/2;
			long a[] = new long[r1];
			long b[] = new long[r2];
			while(l+k<n)
			{
				a[k++] = sc.nextLong();
				if(l<r2)
					b[l] = sc.nextLong();
				l++;
			}
			if(n==2)
			{
				if(a[0]!=b[0])
				{
				System.out.println(a[0]>b[0]?a[0]:b[0]);continue;}
				else{System.out.println(0);continue;}
			}
			Arrays.sort(a);
			Arrays.sort(b);
			long hcfa = a[0], hcfb = b[0];
			for(int i = 1; i<r1;i++)
				hcfa = hcf(hcfa, a[i]);
			for(int i = 1; i<r2;i++)
				hcfb = hcf(hcfb, b[i]);
			k = 0;
			if(hcfb==1 && hcfa==1)
				System.out.println(0);
			else
			{
				if(hcfb!=1)
					for(int i = 0; i<r1;i++)
					{
						if(a[i]%hcfb==0)
						{
							k = 1;
							break;
						}
					}
				if(k!=1 && hcfb!=1)
				{
					System.out.println(hcfb);
					continue;
				}
				k = 0;
				if(hcfa!=1)
					for(int i = 0; i<r2;i++)
					{
						if(b[i]%hcfa==0)
						{
							k = 1;
							break;
						}
					}
				if(k!=1 && hcfa!=1)
				{
					System.out.println(hcfa);
					continue;
				}
				System.out.println(0);
			}
		}
    }     
     
	 
  	public static long hcf(long a,long b)
	{
		while (b > 0)
		{
			long temp = b;
			b = a % b; 
			a = temp;
		}
		return a;
	}
}