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

public class TheMiracleAndTheSleeper
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			String s[] = br.readLine().split(" ");
			int l = Integer.parseInt(s[0]);
			int r = Integer.parseInt(s[1]);
			if(l==r) out.println(0);
			else out.println(Math.min(r-l,r%2==1?r/2:r/2-1));
		}
		out.close();
	}
}
