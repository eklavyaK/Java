import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class NezzarandLuckyNumber
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
			String arr[] = br.readLine().split(" ");
			for(int i=0;i<n;i++)
			{
				int q = Integer.parseInt(arr[i]);
				if(q>=10*k)
					out.println("yes");
				else
				{
					if(q<k)
						out.println("no");
					else if(k==5)
					{
						if(q%10==5||q%10==0)
							out.println("yes");
						else out.println("no");
					}
					else
					{
						int r = 1,lastdigit=q%10,numofintegers=0;
						while(r<10)
						{if((k*r)%10==lastdigit){numofintegers=r;break;}r++;}
						if(numofintegers==0)
							out.println("no");
						else
						{
							if(numofintegers*k>q)
								out.println("no");
							else
								out.println("yes");
						}
					}
				}
			}
		}
		out.close();
	}
}