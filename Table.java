import java.util.*;
public class Table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int p = x;
		for(int i=1;i<=10;)
		{
			System.out.println(x);
			x+=p;
			i++;
		}
	}
}
