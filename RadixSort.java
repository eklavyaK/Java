import java.util.*;
public class RadixSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int t[] = new int[n];
		for(int i=0; i<n;i++)
		a[i] = sc.nextInt();
		for(int k=0; k<3; k++)
		{
			int u=1, v=1;
			for(int w=0; w<k+1; w++)
			u=u*10;
			v = u/10;
			int m=0;
			for(int i=0; i<10; i++)
			{
				for(int j=0; j<n; j++)
				{
					int g = a[j]%u;
					int h = (int)g/v;
					if(h==i)
					{
						t[m]=a[j];
						m++;
					}
				}
			}
			a = t.clone();
		}
		for(int i=0; i<n; i++)
		System.out.print(a[i] + " ");
	}
}
