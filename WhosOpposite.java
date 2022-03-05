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

public class WhosOpposite
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			String s[] = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			int n = 2*Math.abs(a-b);
			if(n>=c && Math.min(a,b)<=n/2){
				if(c>n/2) out.println(c-n/2);
				else out.println(c+n/2);
			}
			else out.println(-1);
		}
		out.close();
	}
}
