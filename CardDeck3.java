import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
public class CardDeck3
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
			int deck[] = new int[n];
			int pos[] = new int[n+1];
			for(int i=0;i<n;i++)
			{
				deck[i] = Integer.parseInt(input[i]);
				pos[deck[i]] = i;
			}
			int l = n;
			for(int i=n;i>0;i--)
			{
				int index = pos[i];
				if(l>index)
				{
					for(int j=index; j<l;j++)
						out.print(deck[j]+" ");
					l=index;
				}
			}
			out.println();
		}
		out.close();
	}
}