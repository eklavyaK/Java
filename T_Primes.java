import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
public class T_Primes
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		for(int i = 0; i<n; i++)
		{
			long num = Long.parseLong(s[i]);
			if(num%2!=0 && num%3!=0)
			{
				if(num==1){out.println("NO");continue;}
				double sq = Math.sqrt(num);
				if(sq==(int)sq){int k = 0;
					for (int j = 3; j <= Math.sqrt(sq); j += 2)
						if ((int)sq % j == 0)
						{out.println("NO");k=1;break;}
				if(k==0) out.println("YES");}
				else out.println("NO");
			}
			else if(num == 4 || num == 9)
				out.println("YES");
			else out.println("NO");
		}
		out.close();
	}
}