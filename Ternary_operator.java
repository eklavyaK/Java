import java.util.*;
public class Ternary_operator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int w = (x>y)?(x>z?x:z):(y>z?y:z);
		System.out.println(w);
	}
}
