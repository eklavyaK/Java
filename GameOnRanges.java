import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class GameOnRanges
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[][] = new int[n][2];
			int b[] = new int[n];int i = 0;
			for(i = 0;i<n;i++)
			{
				String input[] = br.readLine().split(" ");
				a[i][0] = Integer.parseInt(input[0]);
				a[i][1] = Integer.parseInt(input[1]);
			}
			out.println();
			Arrays.sort(a,(a1,a2)->{return (a1[1]-a1[0])-(a2[1]-a2[0]);});i=0;
			while(i<n && a[i][1]-a[i][0]==0)
				i++;
			//for(int j = 0;j<n;j++)
				//out.println(a[j][0]+" "+a[j][1]);
			for(int j = 0; j<i;j++)
			{
				int l = a[j][0];
				int r = l;
				out.println(l+" "+l+" "+l);
				for(int x = i;x<n;x++)
				{
					if(l==a[x][0])
					{
						if(b[x]==0)
						{
							out.println(a[x][0]+" "+a[x][1]+" "+(r+1));
							l=a[x][0];r=a[x][1];b[x]=1;
						}
						else break;
					}
					else if(r==a[x][1])	
					{
						if(b[x]==0)
						{
							out.println(a[x][0]+" "+a[x][1]+" "+(l-1));
							l=a[x][0];r=a[x][1];b[x]=1;
						}
						else break;
					}
				}
			}
		}			
		out.close();
	}
}