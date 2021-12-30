import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class AllareSame
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = sc.nextLine();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0;i<n;i++) a[i] = sc.nextInt();
			Arrays.sort(a);int hcf = 0;
			for(int i = 0; i<n-1; i++)
			{if(a[i]!=a[i+1]){if(hcf==0){ hcf = a[i+1]-a[i]; continue;}  hcf = hcfs(hcf, a[i+1]-a[i]);}}
			if(hcf!=0)
				System.out.println(hcf);
			else
				System.out.println(-1);
		}
	}
	public static int hcfs(int a1,int b1)
	{
		int a = Math.max(a1,b1);
		int b = Math.min(a1,b1);
		while (b > 0)
		{
			int temp = b;
			b = a % b; 
			a = temp;
		}
		return a;
	}
}