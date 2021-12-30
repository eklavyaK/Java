import java.util.*;
public class BucketSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n;i++)
		a[i] = sc.nextInt();
		int b[] = new int[151];
		for(int i=0; i<=150; i++)
		{
			int k=0;
			for(int j=0; j<n; j++)
			{
				if(i==a[j])
				{
					k++;
				}
			}
			b[i]=k;
		}
		for(int i=0; i<151;i++)
		{
			for(int j=0; j<b[i]; j++)
			System.out.print(i + " ");
		}
	}
}
