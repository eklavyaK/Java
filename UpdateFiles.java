import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class UpdateFiles
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = sc.nextLine();
		while(t-->0)
		{
			long n = sc.nextLong(), k = sc.nextLong();
			if(n==1){System.out.println(0);continue;}
			if(n==2){System.out.println(1);continue;}
			long r = 0l, i = 0l;
			while((long)Math.pow(2,i)<=k)
			{i++;}
			r = n - (long)Math.pow(2,i);
			long b = (long)Math.pow(2,i-1);
			if(b == k && b%10==k%10 && n<=Math.pow(2,i) && k==n)
				System.out.println(i-1);
			else if(n<=(long)Math.pow(2,i))
				System.out.println(i);
			else if(n>(long)Math.pow(2,i) && r%k == 0)
				System.out.println(i + (long)r/k);
			else
				System.out.println(i + (long)r/k + 1);
		}
	}
}