import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
public class TMTDocument
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			StringBuilder str = new StringBuilder(br.readLine());
			int t_count = 0, m_count = 0;
			int detect = 0;
			for(int i = 0; i<n; i++)
			{
				if(str.charAt(i)=='T')
					t_count++;
				else m_count++;
				if(m_count>t_count)
				{detect = 1; break;}
				if(t_count-m_count>n/3)
				{detect = 1; break;}
			}
			if(detect==1||m_count*2!=t_count) out.println("NO");
			else out.println("YES");
		}
		out.close();
	}
}