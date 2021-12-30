import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
public class MaxandMex
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
			ArrayList<Integer> set = new ArrayList<>();
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			String s[] = br.readLine().split(" ");
			if(k==0) {out.println(n);continue;}
			for(int i = 0; i<n; i++)
			{
				set.add(Integer.parseInt(s[i]));
				map.put(Integer.parseInt(s[i]),"1");
			}
			int track = 0;
			Collections.sort(set);
			while(map.get(track)!=null) track++;
			if(track<set.get(n-1))
			{
				int temp = track + set.get(n-1);
				if(map.get(Math.round((float)temp/2))==null) out.println(n+1);
				else out.println(n);
				continue;
			}
			if(track>set.get(n-1))
			{
				out.println(n+k);
			}
		}
		out.close();
	}
}