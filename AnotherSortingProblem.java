import java.io.IOException;
import java.lang.String;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
public class AnotherSortingProblem
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		PrintWriter out = new PrintWriter(System.out);
		String books[] = new String[n];
		for(int i = 0; i<n;i++)
		{books[i] = br.readLine() +""+(i+1);}
		Arrays.sort(books,(a,b)->
		{
			for(int i = 0; i<m;i++)
				if(a.charAt(i)!=b.charAt(i))
				{
					if(i%2==0)
						return (int)a.charAt(i)-b.charAt(i);
					else
						return (int)b.charAt(i)-a.charAt(i);
				}
			return 0;
		});
		for(int i = 0; i<n;i++)
			out.print(books[i].substring(m)+" ");
		out.close();
	}
}