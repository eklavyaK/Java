import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
public class GCDlength
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String input[] = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			if(a==1){out.println(1+" "+(int)Math.pow(10, b-1));continue;}
			if(b==1){out.println((int)Math.pow(10, a-1)+" "+1);continue;}
			if(c!=1) c = (int)Math.pow(10, c-1)+1;
			else{if(a>=b) out.println((int)(Math.pow(10,a-1)+1)+" "+(int)Math.pow(10,b-1));
				else out.println((int)(Math.pow(10,a-1))+" "+(int)(Math.pow(10,b-1)+1)); continue;}
			
			a = (int)Math.pow(10,a-1);
			b = (int)Math.pow(10,b-1);
			a = a + c-(a%c);
			b = b + c-(b%c);
			int check = gcd(a,b);
			while(check!=c)
			{
				a = a+c;
				check = gcd(a,b);
			}
			out.println(a+" "+b);
		}
		out.close();
	}
	public static int gcd(int a1, int b1)
	{
		int a = Math.max(a1,b1);
		int b = Math.min(a1,b1);
		while(b>0)
		{
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
}