import java.util.*;
public class NoOfDigits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = isDigitOccur(x,y);
		if(a==0)
		{
			System.out.println("FALSE");
			System.out.println(a);
		}
		else
		{
			System.out.println("TRUE");
			System.out.println(a);
		}
	}
	public static int isDigitOccur(int m,int n)
	{
		int k = 0,l,i,p = n;
		while(n!=0)
		{
			l = n%10;
			if(l==m)
			k++;
			n = (int)n/10;
		}
		if(p==0)
		{
			if(m==0)
			return 1;
			else
			return 0;
		}
		else 
		return k;
	}
}			
 