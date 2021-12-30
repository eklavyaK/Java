import java.util.Scanner;
import java.lang.Math;
public class ChatBan
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++)
		{
			long k = sc.nextLong();
			long x = sc.nextLong();
			double n = (double)(Math.sqrt(1+8*x)-1)/2;
			long m = (long)n;
			if(x<(m*m+m)/2)
				m--;
			if(x == (m*m+m)/2)
			{
				if(k>=m)
					System.out.println(m);
				else
				{
					long r = x - ((k*k+k)/2);
					if((k*k-k)/2<=r)
						System.out.println(2*k-1);
					else
					{
						double p = ((2*k-1) - (double)Math.sqrt(4*k*k - 4*k + 1 - 8*r))/2;
						long y = (long)p;
						long result = ((k*k-k)/2) - (((k-y)*(k-y)-(k-y))/2);
						if(r>result)
							System.out.println(k+y+1);
						else
							System.out.println(k+y);
					}
				}
			}
			else
			{
				if(k>=m+1)
					System.out.println(m+1);
				else
				{
					long r = x - (k*k+k)/2;
					if((k*k-k)/2<=r)
						System.out.println(2*k-1);
					else
					{
						double p = ((2*k-1) - (double)Math.sqrt(4*k*k - 4*k + 1 - 8*r))/2;
						long y = (long)p;
						long result = ((k*k-k)/2) - (((k-y)*(k-y)-(k-y))/2);
						if(r>result)
							System.out.println(k+y+1);
						else
							System.out.println(k+y);
					}
				}
			}
		}
	}
}	