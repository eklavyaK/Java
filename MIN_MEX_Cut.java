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

public class MIN_MEX_Cut
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			String s = br.readLine();
			boolean zero = true; int count = 0;
			for(int i = 0; i<s.length(); i++){
				if(zero && s.charAt(i)=='0') {count++;if(count==2) break;zero=!zero;}
				else if(!zero && s.charAt(i)=='1') zero = true;
			}
			out.println(count);
		}
		out.close();
	}
}
