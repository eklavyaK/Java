import java.util.*;
class Series
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
		int x[] = new int[q];
		int y[][] = new int[q][];
		int sum = 0, t, m, j, k;
        for(int i=0;i<q;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
			y[i] = new int[n];
			x[i] = n;
			for(j=0;j<n;j++)
			{
				for(k=0;k<=j;k++)
				{
					sum = sum + power(2,k)*b;
				}
				y[i][j]=a+sum;
				sum=0;
			}
		}
		for(m=0;m<q;m++)
		{
			for(t=0;t<x[m];t++)
			{
				System.out.print(y[m][t]+" ");
			}
			System.out.println();
		}
		in.close();
    }
    public static int power(int k,int l)
    {
        int p=k;
        if(l!=0)
        for(int j=1;j<l;j++)
        {
            p*=k;
        }
        else
        return 1;
        return p;
    }
}