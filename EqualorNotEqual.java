import java.util.Scanner;
public class EqualorNotEqual
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String temp = sc.nextLine();
		while(t-->0)
		{
			String s = sc.nextLine();
			int n = s.length();
			if(s.length()==2)
			{
				if(s.charAt(0)!=s.charAt(1))
					System.out.println("NO");
				else System.out.println("YES");
				continue;
			}
			char c = s.charAt(0);
			int k = 0;
			if(c=='E')
			{
				for(int i = 1; i<n-1; i++)
				{
					if(s.charAt(i)!='E')
						k++;
				}
				if (k==1&&s.charAt(n-1)=='E')
					System.out.println("NO");
				else if(k==0 && s.charAt(n-1)=='N')
					System.out.println("NO");
				else
					System.out.println("YES");
			}
			else
			{
				for(int i = 1; i<n-1; i++)
				{
					if(s.charAt(i)!='E')
					{System.out.println("YES");k=1;break;}
				}
				if(k==0 && s.charAt(n-1)!='N')
					System.out.println("NO");
				else if(k==0&&s.charAt(n-1)=='N')
					System.out.println("YES");
			}
		}
	}
}