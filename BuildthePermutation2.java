import java.util.Scanner;
import java.lang.Math;
public class BuildthePermutation2
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
			int k = 0, m = 1;
			StringBuffer s = new StringBuffer("1 2");
			if((a!=0 || b!=0)&&n>2)
			{
				if(Math.abs(a-b)<=1)
				{
					if(a>b)
						for(int i = 3; i<n+1; i++)
						{
							if(a!=0 && k == 0)
							{
								while(s.charAt(m)!=' ')
									m++;
								s.insert(m+1, i+" ");
								m = 1;
								a--;
								k = 1;
							}
							else if(b!=0 && k == 1)
							{
								s.insert(0, i+" ");
								b--;
								k = 0;
							}
							else
							{
								while(s.charAt(m)!=' ')
									m++;
								s.insert(m+1, i+" ");
							}
						}
					else if(a==b)
						for(int i = 3; i<n+1; i++)
						{
							if(a!=0 && k == 0)
							{
								while(s.charAt(m)!=' ')
									m++;
								s.insert(m+1, i+" ");
								a--;
								k = 1;
							}
							else if(b!=0 && k == 1)
							{
								s.insert(0, i+" ");
								b--;
								k = 0;
							}
							else
								s.insert(0, i+" ");
						}
					else
						for(int i = 3; i<n+1; i++)
						{
							if(b!=0 && k == 0)
							{
								s.insert(0, i+" ");
								b--;
								k = 1;
							}
							else if(b!=0 && k == 1)
							{
								while(s.charAt(m)!=' ')
									m++;
								s.insert(m+1, i+" ");
								a--;
								k = 0;
							}
							else
								s.insert(0, i+" ");
						}
					if(a==0 && b==0)
						System.out.println(s);
					else
						System.out.println(-1);
				}
				else
				{
					System.out.println(-1);
					continue;
				}
			}
			else if(a==0 && b==0 && n>2)
			{
				String p = "2 1";
				for(int i = 3; i<n+1; i++)
					p = i + " " + p;
				System.out.println(p);
			}
			else
			{
				if(a == 0 && b==0 && n==2)
				{
					System.out.println(s);
					continue;
				}
				else
				{
					System.out.println(-1);
					continue;
				}
			}
		}
	}
}	