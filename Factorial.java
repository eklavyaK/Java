import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=1, x = sc.nextInt();
		if(x==0)
		{
			a=1;
		}
		else
		{
			do
			{
				a*=x--;
			}
			while(x!=0);
		}
		System.out.println(a);
	}
}
