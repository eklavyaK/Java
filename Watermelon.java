import java.util.Scanner;
class watermelon
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int k = 0, a = sc.nextInt();
		for (int i = 2; i < a; i += 2)
		{
			if( (a-i)%2==0 & (a-i)!=0)
			{
				System.out.println("YES");
				k = 1;
				break;
			}
		}
		if (k == 0)
			System.out.println("NO");
	}
}