import java.util.*;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int x=s.length();
		int n=1;
		char a,b;
		for(int i=1;i<=x;i++)
		{
			a=s.charAt(i-1);
			b=s.charAt(x-i);
			if(a!=b)
			{	
				n=0;
				break;
			}
		}
		if(n==1)
		System.out.println("True");
		else
		System.out.println("False");
	}
}
