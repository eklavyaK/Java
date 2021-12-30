import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.Math;
public class testfile2
{
	public static void main(String args[]) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		while(i>1)
		{
			int detect = 0;
			for(int j = 2;j<i;j++)
			{
				if(i%j==0)
				{detect = 1;break;}
			}
			if(detect == 1)
				out.println("not prime");
			else out.println("prime");
			out.flush();
			i = sc.nextInt();
		}
	}
}