import java.util.*;
public class No_of_characters
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int a=(int)s.charAt(0);
		int b=(int)s.charAt(2);
		int i,n;
		n=0;
		if(b>a)
		{
			for(i=a+1;i<b;i++)
			{
				n++;
			}
		}
		else
		{
			for(i=b+1;i<a;i++)
			{
				n++;
			}
		}	
		System.out.println(n);
	}
}