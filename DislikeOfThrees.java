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

public class DislikeOfThrees
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int k = 0;
			for(int i = 0; i<n;) {k++;String s = k+"";if(k%3!=0 && k%10!=3) i++;}
			out.println(k);
		}
		out.close();
	}
}
