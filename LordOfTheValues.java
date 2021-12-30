import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
public class LordOfTheValues
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			out.println(n*3);
			for(int i = 1; i<=n; i+=2)
			{
				out.println(2+" "+i+" "+(i+1));
				out.println(1+" "+i+" "+(i+1));
				out.println(1+" "+i+" "+(i+1));
				out.println(2+" "+i+" "+(i+1));
				out.println(1+" "+i+" "+(i+1));
				out.println(1+" "+i+" "+(i+1));
			}
			out.flush();
		}
		out.close();
	}
}