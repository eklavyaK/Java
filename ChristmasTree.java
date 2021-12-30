import java.util.*;
public class ChristmasTree
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int a=1;a<=x;)
		{
			for(int b=1;b<=a;)
			{
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}
	}
}
