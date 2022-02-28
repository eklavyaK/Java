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

public class LuntikAndSubsequences
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String s[] = br.readLine().split(" ");
			int count1 = 0, count0 = 0;
			for(int i = 0; i<n; i++) {if(Integer.parseInt(s[i])==1) count1++; else if(Integer.parseInt(s[i])==0) count0++;}
			out.println((long)Math.pow(2,count0)*count1);
		}
		out.close();
	}
}