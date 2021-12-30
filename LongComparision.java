import java.util.Scanner;
import java.lang.String;
public class LongComparision
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for(int i = 0; i<n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(a!=0 & c!=0)
			{
				String sta = a + "";
				String stc = c + "";
				if(sta.length()+b<stc.length()+d)
					System.out.println("<");
				if(sta.length()+b>stc.length()+d)
					System.out.println(">");
				if(sta.length()+b==stc.length()+d)
				{
					for(int j = 0; j< 10000; j++)
					{
						if(sta.length()>stc.length())
							stc = stc+"0";
						if(sta.length()<stc.length())
							sta = sta+"0";
						if(sta.length()==stc.length())
							break;
					}
					a = Integer.parseInt(sta);
					c = Integer.parseInt(stc);
					if(a<c)
						System.out.println("<");
					if(a>c)
						System.out.println(">");
					if(a==c)
						System.out.println("=");
				}
			}
			else
			{
				if(a!=0 & c==0)
					System.out.println(">");
				if(a==0 & c!=0)
					System.out.println("<");
				if(a==0 & c==0)
					System.out.println("=");
			}
		}
	}
}