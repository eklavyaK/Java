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

public class ArrayEversion
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			String s[] = br.readLine().split(" ");
			for(int i = 0; i<n; i++){
				a[i]=Integer.parseInt(s[i]);
			}
			int count = 0, max = a[n-1];
			for(int i = n-2; i>=0; i--){
				if(a[i]>max) {max = a[i];count++;}
			}
			out.println(count);
		}
		out.close();
	}
}