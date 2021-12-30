import java.lang.Math;
import java.lang.String;
import java.util.Scanner;
public class TwoSorts
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String intval = sc.nextLine();
		long n = Long.parseLong(intval);
		int k = 0, len = intval.length();
		long lastint = 0, sum = 0, r = 0;
		String a[] = new String[(int)n+1];
		a[(int)r] = "1";
		long prev = 1;
		if(len!=1)
			lastint = (long)Math.pow(10,len-1)-1;
		if(len==1)
			lastint = n;
		if(n == (long)Math.pow(10,len)-1)
			lastint = (long)Math.pow(10,len)-1;
		while(1 == 1)
		{
			if(prev != n) 
			{
				if(a[(int)r].length() < len)
				{
					prev = prev*10;
					a[(int)++r] = prev + "";
					continue;
				}
				a[(int)++r] = (++prev) + "";
				if(prev == lastint)
					break;
				if(prev%10 == 9)
				{
					a[(int)++r] = change(prev, len) + "";
					prev = Long.parseLong(a[(int)r]);
				}
			}
			else
			{
				if(len != 1)
					k = 1;
				break;
			}
		}
		if(k==1)
		{
			prev = (prev - prev%10)/10 + 1;
			a[(int)++r] = prev + "";
			while(1==1)
			{
				if(a[(int)r].length() < len-1)
				{
					prev = prev*10;
					a[(int)++r] = prev + "";
					continue;
				}
				a[(int)++r] = (++prev) + "";
				if(prev == lastint)
					break;
				if(prev%10 == 9)
				{
					a[(int)++r] = change(prev, len-1) + "";
					prev = Long.parseLong(a[(int)r]);
				}
			}
		}
		long h = 0, result = 0;
		while(h<n)
		{
			result = (h+1) - Long.parseLong(a[(int)h]);
			if(result<0)
				sum = sum + 998244353+result;
			else
				sum = sum + result % 998244353;
			h++;
		}
		System.out.println((long)(sum % (Math.pow(10,9) + 7)));        
	}
	public static int change( long a, int b )
	{
		for( int i = 0; i < b; i++)
		{
			a = (a - 9)/10;
			if(a%10 != 9)
				break;
		}
		return (int)a+1;
	}	
}
	