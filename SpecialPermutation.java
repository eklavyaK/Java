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

public class SpecialPermutation
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int a = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);
			if(a<=n/2+1 && b>=n/2 && a!=b){
				if(a<b && n-b+1<=n/2 && n-a>=n/2){
					for(int i = b+1; i<=n; i++) out.print(i+" ");
					for(int i = a; i<a+b-n/2; i++) out.print(i+" ");
					for(int i = 1; i<a; i++) out.print(i+" ");
					for(int i = b; i>=a+b-n/2; i--)out.print(i+" ");
				}
				else if(a>b && a==n/2+1 && b==n/2){
					for(int i = 0; i<n/2; i++)out.print(a+++" ");
					for(int i = 0; i<n/2; i++)out.print(b--+" ");
				}
				else out.print(-1);
				out.println();
			}
			else out.println(-1);
			out.flush();
		}
		out.close();
	}
}
