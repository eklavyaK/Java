import java.util.*;
public class InsertionSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n;i++)
		a[i] = sc.nextInt();
		for(int i=1;i<n;i++)
		{
			int k,j = i, t = a[i];
			while(j!=0)
			{
				j--;
				if(t>=a[j])
				{
					a[j+1] = t;
					break;
				}
				a[j+1] = a[j];
				if(j==0)
				a[0] = t;
			}
		}
		for(int i=0; i<n;i++)
		System.out.print(a[i] + " ");
	}
}
