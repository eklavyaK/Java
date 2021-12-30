import java.util.Scanner;
import java.lang.String;
public class WilliamtheVigilant2
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
					k++;
			}
			for(int i = 0; i<q; i++)
			{
				int pos = sc.nextInt();
				char initial =s.charAt(pos-1);
				char c = sc.nextLine().charAt(1);
				if(initial != c)
				{	
					for(int j = pos-1; j<Math.min(pos+2,n); j++)
						if(j-2>=0)
							if(s.charAt(j-2)=='a' && s.charAt(j-1)=='b' && s.charAt(j)=='c')
							{
								k--;
								break;
							}
					s.setCharAt(pos-1, c);
					for(int j = pos-1; j<Math.min(pos+2,n); j++)
						if(j-2>=0)
							if(s.charAt(j-2)=='a' && s.charAt(j-1)=='b' && s.charAt(j)=='c')
							{
								k++;
								break;
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
