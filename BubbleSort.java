import java.util.*;
public class BubbleSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int a[] = new int[m];
		for(int k=0;k<m;k++)
		a[k] = sc.nextInt();
		for(int i=1;i<m;i++)
		{
			for(int j=0;j<m-i;j++)
			{
				if((a[j])>(a[j+1]))
				{
				int b=a[j];
				a[j]=a[j+1];
				a[j+1]=b;
				}
			}
		}
		for(int k=0;k<m;k++)
		System.out.print(a[k]+" ");
	}
}