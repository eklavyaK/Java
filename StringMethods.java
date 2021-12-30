import java.util.*;
public class StringMethods
{
	public static void main(String args[]) 
    {
	    Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = ccat(s1,s2);
		int k = ctain(s1,s2);
		if(k==1)
		System.out.println("YES");
		else
		System.out.println("NO");
		System.out.println(s3);
	}
	public static int ctain(String x,String y)
	{
		int n=1;
		for(int i=0;i<x.length();i++)
		{
			if(x.charAt(i)==y.charAt(0))
			{
				for(int j=0; j<y.length();j++)
				{
					if((i+j)<x.length())
					{
						n=0;
						if(y.charAt(j) != x.charAt(i+j))
						{
							n=1;
							break;
						}
					}
					else
					{
						n=1;
						break;
					}
				}
			}
			if(n==0)
			break;
		}
		if(n==0)
		return 1;
		else
		return 0;
	}
	public static String ccat(String x,String y)
	{
		return x+y;
	}
}