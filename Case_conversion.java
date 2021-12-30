import java.util.*;
public class Case_conversion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int x=s.length();
		for(int i=0;i<x;i++)
		{
			char ch = s.charAt(i);
			int a = (int)ch + 32;
			System.out.print((char)a);
		}
	}
}
