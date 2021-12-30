import java.util.*;
public class Varags
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='.')
			{
				String a[] = s.split(",");
				FindElement(Double.parseDouble(a[0]),Double.parseDouble(a[1]),Double.parseDouble(a[2]),Double.parseDouble(a[3]),Double.parseDouble(a[4]));
				break;
			}
			if(s.charAt(i)=='\'')
			{
				FindElement(s.charAt(1),s.charAt(5),s.charAt(9),s.charAt(13),s.charAt(17));
				break;
			}
			else
			{
				if(s.indexOf('.')==(-1))
				{
					String a[] = s.split(",");
					FindElement(Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4]));
					break;
				}
			}
		}
	}
	public static void FindElement(int ... a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<a[0])
			a[0]=a[i];
		}
		System.out.println(a[0]);
	}
	public static void FindElement(double ... a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[0])
			a[0]=a[i];
		}
		System.out.println(a[0]);
	}	
	public static void FindElement(char ... a)
	{
		char k='0';
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if((int)a[j]>(int)a[j+1])
				{
					k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i!=(a.length-1))
			System.out.print(" ");
		}
	}
}
		