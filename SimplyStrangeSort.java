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

public class SimplyStrangeSort
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String s[] = br.readLine().split(" ");
			int a[] = new int[n],count = 0;
			for(int i = 0; i<n; i++)a[i]=Integer.parseInt(s[i]);
			boolean detect = true;
			while(detect){
				detect = false;
				for(int j = count%2; j<n-1; j+=2){
					if(a[j]>a[j+1]){
						int temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						detect = true;
					}
				}
				if(detect)count++;
				else{
					for(int i = 1; i<=n; i++) if(a[i-1]!=i){detect=true;break;}
					if(detect)count++;
				}
			}
			out.println(count);
		}
		out.close();
	}
}
