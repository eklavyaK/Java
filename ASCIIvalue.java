import java.util.*;
public class ASCIIvalue
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int a=(int)s.charAt(0);
		int b=(int)s.charAt(2);
		int i;
		if(b>a)
		{
			for(i=a+1;i<b;)
			{
				System.out.print(i+" ");
				i++;
			}
		}
		else
		{
			for(i=b+1;i<a;)
			{
			System.out.print(i+" ");
				i++;
			}
		}	
	}
}