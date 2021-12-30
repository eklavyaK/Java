import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class NewColony
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			String height[] = br.readLine().split(" ");
			int mount[] = new int[n];
			for(int i=0;i<n;i++)
				mount[i] = Integer.parseInt(height[i]);
			int j=0;
			for(int i=0;i<k;i++)
			{
				for(j=0;j<n-1;)
					if(mount[j]<mount[++j])
					{mount[--j]++;break;}
				if(j==n-1){out.println(-1);break;}
			}
			if(j!=n-1)
				out.println(j+1);
		}
		out.close();
	}
}