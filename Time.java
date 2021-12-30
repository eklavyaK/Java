import java.util.*;
public class Time
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w,x,y,z;
	    x=(int)n/3600;
		y=n%3600;
		z=(int)y/60;
		w=y%60;
		System.out.println(x+":"+z+":"+w);
	}
}
