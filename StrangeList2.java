import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class StrangeList2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s[] = br.readLine().split(" ");
			int x = Integer.parseInt(s[1]);
			int n = Integer.parseInt(s[0]);
			String input[] = br.readLine().split(" ");
			int trace[][] = new int[n][2];
			int track = 0, detect = 0;
			long sum=0l;
			for(int i = 0; i<n; i++)
			{
				int q = Integer.parseInt(input[i]);
				if(q%x==0)
				{
					trace[track][0] = q/x;
					trace[track++][1] = q;
					sum = sum + q;
				}
				else {detect = 1;
					for(;i<n;i++)
						sum = sum + Integer.parseInt(input[i]);
					for(int j = 0;j<track;j++)
						sum = sum + trace[j][1];
					break;
				}
			}
			int count;
			while(detect == 0)
			{
				for(count = 0; count<n; count++)
				{
					if(trace[count][0]%x==0)
					{trace[count][0] = trace[count][0]/x;sum = sum + trace[count][1];}
					else {detect = 1;
					for(int j = 0;j<n;j++)
						sum = sum + trace[j][1];
					break;
					}
				}
			}
			out.println(sum);
		}
		out.close();
	}
}