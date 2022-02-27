import java.util.Scanner;
import java.util.Arrays;
public class DivineArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int k, g, u=0, t = sc.nextInt();
		int index=0, result[] = new int[100000];
		for (int i = 0; i<t; i++)
		{
			k=0;
			g=0;
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int z[] = new int[n];
			for (int j = 0; j<n; j++)
			{
				a[j] = sc.nextInt();
				b[j] = a[j];
			}
			int q = sc.nextInt();
			index = index + q;
			int c[][] = new int[q][2];
			for (int r = 0; r<q; r++)
			{
				c[r][0] = sc.nextInt();
				c[r][1] = sc.nextInt();
				if(c[r][1]>k)
					k=c[r][1];
			}
			for(int y = 0; y<q; y++)
			{
				if(c[y][1]==0)
					result[index-q+y] = b[c[y][0]-1];
			}
			for(int h = 1; h <= k; h++)
			{
				for( int m = 0; m<n; m++)
				{
					int f = 0;
					for( int p = 0; p<n; p++)
					{
						if(a[m] == a[p])
						{
							f++;
						}
					}
					z[m] = f;
				}
				for(int l = 0; l<q; l++)
				{
					if(c[l][1]==h)
						result[index-q+l] = z[c[l][0]-1];
				}
				if (Arrays.equals(z,a))
				{
					u = h;
					g = 1;
					break;
				}
				a = z.clone();
			}
			if (g==1)
			{
				for(int l = 0; l<q; l++) 
				{
					if(c[l][1]>u)
						result[index-q+l] = z[c[l][0]-1];
				}
			}
		}
		for(int r = 0; r<index; r++)
		{
			System.out.println(result[r]);
		}
	}
}