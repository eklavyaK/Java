import java.lang.Math;
import java.lang.String;
import java.util.Scanner;
public class TwoSorts2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String intval = sc.nextLine();
		long n = Long.parseLong(intval);
		int k = 0, len = intval.length();
		long i = 1, result = 0, lastint = 0, sum = 0, r = 0;
		long prev = 1;
		result = i++ - prev;
		if(result<0)
			sum = sum + 998244353+result;
		else
			sum = sum + result % 998244353;
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
				if(String.valueOf(prev).length() < len)
				{
					prev = prev*10;
					result = i++ - prev;
					if(result<0)
						sum = sum + 998244353+result;
					else
						sum = sum + result % 998244353;
					continue;
				}
				result = i++ - ++prev;
				if(result<0)
					sum = sum + 998244353+result;
				else
					sum = sum + result % 998244353;
				if(prev == lastint)
					break;
				if(prev%10 == 9)
				{
					prev = change(prev, len);
					result = i++ - prev;
					if(result<0)
						sum = sum + 998244353+result;
					else
						sum = sum + result % 998244353;
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
			result = i++ - prev;
			if(result<0)
				sum = sum + 998244353+result;
			else
				sum = sum + result % 998244353;
			while(1==1)
			{
				if(String.valueOf(prev).length() < len-1)
				{
					prev = prev*10;
					result = i++ - prev;
					if(result<0)
						sum = sum + 998244353+result;
					else
						sum = sum + result % 998244353;
					continue;
				}
				result = i++ - ++prev;
				if(result<0)
					sum = sum + 998244353+result;
				else
					sum = sum + result % 998244353;
				if(prev == lastint)
					break;
				if(prev%10 == 9)
				{
					prev = change(prev, len-1);
					result = i++ - prev;
					if(result<0)
						sum = sum + 998244353+result;
					else
						sum = sum + result % 998244353;
				}
			}
		}
		System.out.println((long)(sum % (Math.pow(10,9) + 7)));        
	}
	public static long change( long a, int b )
	{
		for( int i = 0; i < b; i++)
		{
			a = (a - 9)/10;
			if(a%10 != 9)
				break;
		}
		return a+1;
	}	
}