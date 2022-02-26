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

public class testfile
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s[] = br.readLine().split(" ");
			long x = Long.parseLong(s[0]);
			long n = Long.parseLong(s[1]);
			if(x%2==0){
				if(n%4==1){
					out.println(x-n);
				}
				else if(n%4==2){
					out.println(x+1);
				}
				else if(n%4==3){
					out.println(x+n+1);
				}
				else out.println(x);
			}
			else{
				if(n%4==1){
					out.println(x+n);
				}
				else if(n%4==2){
					out.println(x-1);
				}
				else if(n%4==3){
					out.println(x-n-1);
				}
				else out.println(x);
			}
		}
		out.close();
	}
}