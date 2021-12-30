import java.util.*;
public class SelectionSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int k, a[] = new int[m];
		for(k=0;k<m;k++)
		a[k] = sc.nextInt();
		for(int i=0;i<m-1;i++)
		{
			int b=a[i];
			k=i;
			for(int j=i;j<m;j++)
			{
				if(a[j]<b)
				{
				b=a[j];
				k=j;
				}
			}
			int t=a[i];
			a[i]=a[k];
			a[k]=t;
		}
		for(k=0;k<m;k++)
		System.out.print(a[k]+" ");
	}
}
