import java.util.Scanner;
import java.lang.Math;
public class DivideandMultiply
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i<n; i++)
		{
			int max = 0, k=0;
			long sum = 0;
			int arraylength = s.nextInt();
			int a[] = new int[arraylength];
			for(int j = 0; j<arraylength; j++)
			{
				a[j] = s.nextInt();
				while(a[j]%2==0)
				{
					a[j] = a[j]/2;
					k++;
				}
				if(a[j]>a[max])
					max = j;
			}
			for(int j = 0; j<arraylength; j++)
				if(j!=max)
					sum = sum + a[j];
			System.out.println(sum + (long)Math.pow(2,k)*a[max]);
		}
	}
}	