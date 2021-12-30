import java.util.*;
import java.text.*;
public class Areas
{
	public static void main(String args[])
	{
        DecimalFormat df = new DecimalFormat("######.00"); 
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		int n=s.length;
		if(n==2)
		{
			int arrect = areaRect(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
			System.out.println(arrect);
		}
		else
		{
			double arcirc = areaCircle(Integer.parseInt(s[0]));
			System.out.println(df.format(arcirc));
		}
	}
	public static double areaCircle(int r)
	{
		return 3.14*r*r;
	}
	public static int areaRect(int l, int b)
	{
		return l*b;
	}
}

