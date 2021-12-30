import java.io.IOException;
import java.util.Scanner;
public class SeatingArrangementsEasyVersion
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int seats = sc.nextInt();
			int m[] = new int[seats];
			long result = 0l;
			for(int i = 0; i<seats; i++)
				m[i] = sc.nextInt();
			for(int i = 1; i<seats;i++)
				for(int j = 0; j<i; j++)
					if(m[j]<m[i])
						result++;
			System.out.println(result);
		}			
	}
}