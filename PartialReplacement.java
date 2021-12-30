import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
public class PartialReplacement
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			StringBuilder s = new StringBuilder(br.readLine());
			int lastindex = s.lastIndexOf("*");
			int firstindex = s.indexOf("*");
			if(lastindex == firstindex)
			{out.println(1);continue;}
			int count = 2;
			int temp = 0;
			int lastseen = 0;
			for(int i = firstindex+1; i<lastindex; i++)
			{
				temp++;
				if(s.charAt(i)=='*') lastseen = i;	
				if(temp == k)
				{count++; temp=0; i=lastseen;}
			}
			out.println(count);
		}
		out.close();
	}
}