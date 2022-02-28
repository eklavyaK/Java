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

public class MochaAndRedAndBlue
{
	public static void main(String args[]) throws java.io.IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0)
		{
			int n = Integer.parseInt(br.readLine()),count=n;char in = 'B'; boolean t = true;
			String s = br.readLine(); String result = "";
			int i = 0; for(;i<n;i++) if(s.charAt(i)!='?'){count=i;result+=s.charAt(i);in = s.charAt(i);t=s.charAt(i)=='B'?true:false;i++;break;}
			while(i<n){
				if(s.charAt(i)=='?'){
					result+=(t?'R':'B');t=!t;
				}
				else {result+=s.charAt(i);t=s.charAt(i)=='R'?false:true;}
				i++;
			}
			t = in=='B'?true:false;
			for(int j = 0; j<count; j++){
				result=(t?'R':'B')+result;t=!t;
			}
			out.println(result);
		}
		out.close();
	}
}
