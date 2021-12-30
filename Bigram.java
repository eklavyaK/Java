import java.util.Scanner;
public class Bigram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int k=0, n = sc.nextInt();
			String str = sc.nextLine();
			String s[] = sc.nextLine().split(" ");
			str = s[0] + "";
			for(int i = 1; i<n-2; i++)
			{
				if(s[i].charAt(0)==s[i-1].charAt(1))
					str = str+s[i].charAt(1);
				else
				{
					str = str + s[i].charAt(0) + s[i].charAt(1);
					k = 1;
				}
			}
			if(k==1)
				System.out.println(str);
			else
				System.out.println(str+'a');
		}
	}
}
