import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.Math;
import java.lang.String;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;
import java.util.StringTokenizer;

public class InfinityTable
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			int n = Integer.parseInt(br.readLine());
			double r = Math.sqrt(n);
			int t = (int)r;
			if(r==t){
				out.println(t+" "+1);
			}
			else{
				if(Math.pow(t,2)+t<n){
					out.println((t+1)+" "+((int)Math.pow(t+1,2)-n+1));
				}
				else out.println((n-(int)Math.pow(t,2))+" "+(t+1));
			}
		}
		out.close();
	}
}
