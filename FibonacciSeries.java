import java.util.*;
public class FibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int k=0, f=0, p=0, m=1, i=2, n = sc.nextInt();
		if(n!=1)
		{
			while(k==0)
			{
				if(n==0)
				{
					i=1;
					break;
				}
				f = p+m;
				p = m;
				m = f;
				i++;
				if(n==f)
				break;
			}
			System.out.println(i);
		}
		else
		System.out.println(2+","+3);
	}
}