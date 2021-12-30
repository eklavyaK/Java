import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class SpecialNumbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = sc.nextLine();
		while(t-->0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int i = 0;
			while(Math.pow(2,i)<=k)
				i++;
			int power[] = new int[i];
			int track = 0, sum = (int)Math.pow(2,--i);
			power[track] = i; track++;
			for(int r=--i; r>=0; r--)
			{
				if(sum == k)
					break;
				else if(sum+Math.pow(2,r)<=k)
				{sum = sum + (int)Math.pow(2,r);power[track] = r; track++;}
				else 
					continue;
			}
			long result = 0l;
			long mod = 0l;
			for(int ar = 0; ar<track; ar++)
			{
				if(power[ar]==0)
				{mod = mod + 1; break;}
				result = 1;
				for(int e = 1; e<=power[ar]; e++)
					result = (result*n)%1000000007;
				mod = mod + result;
			}
			System.out.println(mod%1000000007);
		}
	}
}