import java.util.*;
public class Upper_Triangular_Matrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int i,j,k=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				if(a[i][j]!=0)
				{
					k=0;
					break;
				}
				else
				{
					k=1;
				}
			}
		}
		if(k==0)
        System.out.println("False");
		else
		System.out.println("True");
	}
}

