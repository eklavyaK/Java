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

public class TwoArrays
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
			String s1[] = br.readLine().split(" ");
			int a[] = new int[n];
			int b[] = new int[n], detect = 1;
			for(int i = 0; i<n; i++) a[i] = Integer.parseInt(s[i]);
			for(int i = 0; i<n; i++) b[i] = Integer.parseInt(s1[i]);
			Arrays.sort(a);Arrays.sort(b);
			for(int i = 0; i<n; i++) if(b[i]!=a[i] && a[i]+1!=b[i]) {detect = 0;break;};
			if(detect == 0) out.println("no");
			else out.println("yes");
		}
		out.close();
	}
}