import java.util.Scanner;
import java.lang.Math;
public class X_MagicPair
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			long a1 = sc.nextLong();
			long b1 = sc.nextLong();
			long x = sc.nextLong();
			if(x>a1 && x>b1)
			{
				System.out.println("NO");
				continue;
			}
			long a = Math.max(a1,b1);
			long b = Math.min(a1,b1);
			int k = 0;
			while(a!=0 && b!=0)
			{
				a = Math.max(a1,b1);
				b = Math.min(a1,b1);
				if(x>a)
					break;
				if(a==x || b==x)
				{
					k = 1;
					System.out.println("YES");
					break;
				}
				if(x>b && ((long)a/b - (long)x/b)>2)
				{
					long q1 = a/b; 
					long q2 = x/b;
					a = a - b*(q1 - q2 - 1);
				}
				else if(x<=b && (long)a/b>2)
				{
					long q1 = a/b;
					a = a - b*(q1 - 1);
				}
				else
					a = a - b;
				a1 = a;
				b1 = b;
			}
			if(k==0)
				System.out.println("NO");
		}
	}
}	
