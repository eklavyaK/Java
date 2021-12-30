import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
public class YetAnotherCardDeck
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int q = Integer.parseInt(input[1]);
		ArrayList<Integer> a = new ArrayList<>();
		String sa[] = br.readLine().split(" ");
		String st[] = br.readLine().split(" ");
		for(int i = n-1; i>=0; i--)
			a.add(Integer.parseInt(sa[i]));
		for(int i = 0; i<q; i++)
		{
			int color = Integer.parseInt(st[i]);
			int index = a.lastIndexOf(color);
			a.remove(index);
			a.add(color);
			out.print((n-index)+" ");
		}
		out.close();
	}
}