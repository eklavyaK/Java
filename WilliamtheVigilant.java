import java.util.Scanner;
import java.lang.String;
public class WilliamtheVigilant
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int k = 0, n = sc.nextInt();
		int q = sc.nextInt();
		String p = sc.nextLine();
		StringBuilder s = new StringBuilder(sc.nextLine());
		if(n>2)
		{
			for(int i = 0; i<n-2; i++)
			{
				if(s.substring(i, i+3).equals("abc"))
				{
					k++;
					i=i+2;
				}
			}
			for(int i = 0; i<q; i++)
			{
				int pos = sc.nextInt();
				char initial =s.charAt(pos-1);
				char c = sc.nextLine().charAt(1);
				if(initial != c)
				{	
					if(initial == 'a')
					{
						if(pos-1<n-2)
							if(s.substring(pos-1, pos + 2).equals("abc"))
								k--;
						s.setCharAt(pos-1, c);
						if(pos-1>0 && pos-1<n-1)
							if(c == 'b' && s.substring(pos-2,pos+1).equals("abc"))
								k++;
						if(pos-1>1)
							if(c == 'c' && s.substring(pos-3,pos).equals("abc"))
								k++;
					}
					if(initial == 'b')
					{
						if(pos-1>0 && pos-1<n-1)
							if(s.substring(pos-2,pos+1).equals("abc"))
								k--;
						s.setCharAt(pos-1, c);
						if(pos-1<n-2)
							if(c == 'a' && s.substring(pos-1,pos+2).equals("abc"))
								k++;
						if(pos-1>1)
							if(c == 'c' && s.substring(pos-3,pos).equals("abc"))
								k++;
					}
					if(initial == 'c')
					{
						if(pos-1>1)
							if(s.substring(pos-3,pos).equals("abc"))
								k--;
						s.setCharAt(pos-1, c);
						if(pos-1>0 && pos-1<n-1)
							if(c == 'b' && s.substring(pos-2,pos+1).equals("abc"))
								k++;
						if(pos-1<n-2)
							if(c == 'a' && s.substring(pos-1,pos+2).equals("abc"))
								k++;
					}
				}
				System.out.println(k);
			}
		}
		else
		{
			for(int i = 0; i<q; i++)
				System.out.println(k);
		}
	}
}