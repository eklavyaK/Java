import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class StrangeList
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
			HashMap<Integer,int[]> map = new HashMap<Integer,int[]>();
			int track = 0, detect = 0;
			long sum=0l;
			for(int i = 0; i<n; i++)
			{
				int q = Integer.parseInt(input[i]);
				if(detect == 0 && q%x==0)
					map.put(track++,new int[]{q/x,q});
				else detect = 1;
				sum = sum + q;
			}
			int count = 0;
			while(count<track)
			{
				if(detect==0)
				{
					if(map.get(count)[0]%x==0)
						map.put(track++, new int[]{map.get(count)[0]/x,map.get(count)[1]});
					else detect = 1;
				}
				sum = sum + map.get(count++)[1];
			}
			out.println(sum);
		}
		out.close();
	}
}