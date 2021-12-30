import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintWriter;
public class CombinatoricsHomework
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		while(t-->0)
		{
			int input[] = new int[3];
			input[0] = sc.nextInt();
			input[1] = sc.nextInt();
			input[2] = sc.nextInt();
			int m = sc.nextInt();
			Arrays.sort(input);
			int a = input[2];
			int b = input[1];
			int c = input[0];
			if(m>a+b+c-3){out.println("no");continue;}
			else if(a-m-1>b+c){out.println("no");continue;}
			else out.println("yes");	
			out.flush();
		}
		out.close();
	}
}