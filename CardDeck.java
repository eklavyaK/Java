import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CardDeck
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
			ArrayList<Integer> result = new ArrayList<Integer>();
			int max = Integer.parseInt(input[0]);
			result.add(max);
			int track = 0;
			for(int i = 1; i<n; i++)
			{
				int a = Integer.parseInt(input[i]);
				if(max>a)
				{result.add(++track,a);continue;}
				max=a;
				track = 0;
				result.add(track,a);
			}
			for(int i = 0; i<n; i++)
				out.print(result.get(i)+" ");
			out.flush();
			out.println();
		}
		out.close();
	}
}