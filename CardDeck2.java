import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuilder;
import java.lang.Math;
public class CardDeck2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split(" ");
			StringBuilder result = new StringBuilder("");
			int max = Integer.parseInt(input[0]);
			String temp = max+" ";
			for(int i = 1; i<n; i++)
			{
				if(Integer.parseInt(input[i])<max)
				{temp = temp+input[i]+" ";continue;}
				result.insert(0,temp);
				max = Integer.parseInt(input[i]);
				temp = input[i] + " ";
			}
			result.insert(0,temp);
			out.println(result);
		}
		out.close();
	}
}