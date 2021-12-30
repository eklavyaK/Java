import java.util.Scanner;
import java.lang.Math;
public class BuildthePermutation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j = 0; j<t; j++)
		{
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = 0;
			int result[] = new int[n];
			result[0] = 2;
			result[1] = 1;
			int m = 1;
			int temp = 0;
			if((a!=0 || b!=0)&&n>2)
			{
				if(Math.abs(a-b)<=1)
				{
					if(a>b)
						for(int i = 3; i<n+1; i++)
						{
							if(a!=0 && k == 0)
							{
								temp = result[m];
								result[m] = i;
								result[++m] = temp;
								a--;
								k = 1;
							}
							else if(b!=0 && k == 1)
							{
								result[++m] = i;
								b--;
								k = 0;
							}
							else
								while(i<n+1)
								{
									temp = result[m];
									result[m] = i++;
									result[++m] = temp;
								}
						}
					else if(a==b)
						for(int i = 3; i<n+1; i++)
						{
							if(a!=0 && k == 0)
							{
								temp = result[m];
								result[m] = i;
								result[++m] = temp;
								a--;
								k = 1;
							}
							else if(b!=0 && k == 1)
							{
								result[++m] = i;
								b--;
								k = 0;
							}
							else
							{
								while(++m<n)
									result[m] = m+1;
								break;
							}
						}
					else
						for(int i = 3; i<n+1; i++)
						{
							if(b!=0 && k == 0)
							{
								result[++m] = i;
								b--;
								k = 1;
							}
							else if(a!=0 && k == 1)
							{
								temp = result[m];
								result[m] = i;
								result[++m] = temp;
								a--;
								k = 0;
							}
							else
							{
								while(++m<n)
									result[m] = m+1;
								break;
							}
						}
					if(a==0 && b==0)
					{
						for(int i = 0; i<n; i++)
							System.out.print(result[i]+ " ");
						System.out.println();
					}
					else
						System.out.println(-1);
				}
				else
					System.out.println(-1);
			}
			else if(a==0 && b==0 && n>2)
			{
				for(int i = 1; i<n+1; i++)
					System.out.print(i+ " ");
				System.out.println();
			}
			else
			{
				if(a == 0 && b==0 && n==2)
					System.out.println("1 2");
				else
					System.out.println(-1);
			}
		}
	}
}