import java.util.*;
import java.lang.*;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			long n = sc.nextInt();
			if(n<1)
				break;
			// Check if number is less than
			// equal to 1
			if (n <= 1)
			{System.out.println("not Prime");continue;}

			// Check if number is 2
			else if (n == 2)
			{System.out.println("Prime");continue;}

			// Check if n is a multiple of 2
			else if (n % 2 == 0)
			{System.out.println("not Prime");continue;}

			// If not, then just check the odds
			int k = 0;
			for (long i = 3; i <= Math.sqrt(n); i += 2)
			{
				if (n % i == 0)
				{System.out.println("not Prime");k=1;break;}
			}
			if(k==0)
				System.out.println("Prime");
		}
	}
}