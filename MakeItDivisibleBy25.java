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

public class MakeItDivisibleBy25
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s = br.readLine();
			int zero = -1, five = -1;
			int countzero = 0, countfive = 0;
			for(int i = s.length()-1;i>=0; i--){
				if(s.charAt(i)=='0'||(zero==0 && s.charAt(i)=='5')) zero++;
				else if(zero < 1){
					countzero++;
				}
				else break;
			}
			for(int i = s.length()-1;i>=0; i--){
				if((five==-1 && s.charAt(i)=='5')||(five==0 && (s.charAt(i)=='7'||s.charAt(i)=='2'))) five++;
				else if(five < 1){
					countfive++;
				}
				else break;
			}
			out.println(five>0?Math.min(countzero,countfive):countzero);
		}
		out.close();
	}
}