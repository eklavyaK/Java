import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class SumOfCubes
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			long n = Long.parseLong(br.readLine());
			if(n==1){out.println("no");continue;}
			int lim1 = (int)Math.cbrt(n);
			int lim2 = (int)Math.cbrt(n/2);
			//out.println(lim1+" "+lim2);out.close();System.exit(0);//250877914575
			int detect = 0;
			for(int i = lim1;i>=lim2;i--)
			{
				float d = (float)Math.cbrt(n - Math.pow(i,3));
				if((int)d == d && d>=1)
				{if(Math.pow(i,3)+Math.pow((int)d,3)==n){out.println("yes");detect=1;break;}}
			}
			if(detect == 0)
				out.println("no");
		}
		out.close();
	}
}