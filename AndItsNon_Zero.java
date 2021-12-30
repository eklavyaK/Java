import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
public class AndItsNon_Zero
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String input[] = br.readLine().split(" ");
			int in = Integer.parseInt(input[0]);
			int r = Integer.parseInt(input[1]);
			if(in ==r){out.println(0);continue;}
			String inb = Integer.toBinaryString(in);
			String rb = Integer.toBinaryString(r);
			int lin = inb.length();
			int lr = rb.length();
			int result[] = new int[lr];
			int diff = r - in + 1;
			int temp = 0, temp2 = 0;
			for(int i = 0; i<lin; i++)
			{
				int j = lin-i-1;
				int rem = (in - (int)Math.pow(2,j))% ((int)Math.pow(2,j+1));
				if(Math.pow(2,j)>rem)
				{
					//if(Math.pow(2,j+1)>r)
						//result[j] = diff;
					if(Math.pow(2,j)+in-rem>r)
						result[j] = diff;
					else
					{
						temp = (diff - ((int) Math.pow(2,j) -rem))/((int)Math.pow(2,j+1));
						temp = temp*(int)Math.pow(2,j);
						temp2 = (diff - ((int) Math.pow(2,j) -rem))%((int)Math.pow(2,j+1));
						if(temp2>Math.pow(2,j))
							temp = temp + temp2-(int)Math.pow(2,j);
						result[j] = temp+(int)Math.pow(2,j) - rem;
					}
				}
				else
				{
					if(rem == (int) Math.pow(2,j))
					{
						temp = (diff)/((int)Math.pow(2,j+1));
						temp = temp*(int)Math.pow(2,j);
						temp2 = (diff)%((int)Math.pow(2,j+1));
						if(temp2>Math.pow(2,j))
							temp = temp + temp2 - (int)Math.pow(2,j);
						result[j] = temp;
					}
					else
					{
						//if(Math.pow(2,j+1)+Math.pow(2,j)>r)
							//result[j] = 0;
						if(in+Math.pow(2,j+1)-rem>r)
							result[j] = 0;
						else
						{
							temp = (diff - ((int)Math.pow(2,j+1)-rem))/((int)Math.pow(2,j+1));
							temp = temp * (int)Math.pow(2,j);
							temp2 = (diff - ((int)Math.pow(2,j+1)-rem))%(int)Math.pow(2,j+1);
							if(temp2<=(int)Math.pow(2,j))
								result[j] = temp + temp2;
							else result[j] = temp + (int)Math.pow(2,j);
						}
					}
				}
			}
			for(int i = lin; i<lr; i++)
			{
				int num = r - (int)Math.pow(2,i)+1;
				temp = num/((int)Math.pow(2,i+1));
				temp = temp*(int)Math.pow(2,i);
				temp2 = num%(int)Math.pow(2,i+1);
				if(temp2<=(int)Math.pow(2,i))
					result[i] = temp + temp2;
				else
					result[i] = temp + (int)Math.pow(2,i);
			}
			Arrays.sort(result);
			out.println(diff-result[lr-1]);
		}
		out.close();
	}
}