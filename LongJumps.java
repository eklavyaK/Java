import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class LongJumps
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			String s[] = br.readLine().split(" ");
			for(int i=n-1;i>=0;i--)
			{
				int temp = Integer.parseInt(s[i]);
				int score = temp;
				while(temp+i<n){
					score=score+a[temp+i];
					temp = temp+a[temp+i];
				}
				a[i] = score;
			}
			Arrays.sort(a);
			out.println(a[n-1]);
		}
		out.close();
	}
}