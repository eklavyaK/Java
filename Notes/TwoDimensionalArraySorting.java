import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;

//We can apply conditional sorting on integer arrays too. In this example we sorted number of two dimensional arrays. Condition was that first column was sorted first then successive
//columns are sorted. Column with lower index value prevails over higher index value column.

public class TwoDimensionalArraySorting
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
			for(int i = 0;i<n;i++)
			{
				String input[] = br.readLine().split(" ");
				a[i][0] = Integer.parseInt(input[0]);
				a[i][1] = Integer.parseInt(input[1]);
			}
			/*Input:
			
			4
			1
			1 1
			3
			1 3
			2 3
			2 2
			6
			1 1
			3 5
			4 4
			3 6
			4 5
			1 6
			5
			1 5
			1 2
			4 5
			2 2
			4 4
			
			*/
			out.println();
			Arrays.sort(a,(a1,a2)->
			{
				if(a1[0]<a2[0]) return -1;
				else if(a1[0]==a2[0]) return a1[1]-a2[1];
				else return 1;
			});
			for(int i = 0; i<n;i++)
				out.println(a[i][0]+" "+a[i][1]);
			out.println();
			
			/*Output:
			
			1 1

			1 3
			2 2
			2 3

			1 1
			1 6
			3 5
			3 6
			4 4
			4 5

			1 2
			1 5
			2 2
			4 4
			4 5
			
			*/
		}	
//I will update with mmore sorting methods later	
		out.close();
	}
}