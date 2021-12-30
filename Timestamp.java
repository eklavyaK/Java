import java.util.*;
public class Timestamp
{
	int hour;
	int min;
	int sec;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1[] = sc.nextLine().split(":");
		Timestamp t1= new Timestamp(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]),Integer.parseInt(s1[2]));
		String s2[] = sc.nextLine().split(":");
		Timestamp t2= new Timestamp(Integer.parseInt(s2[0]),Integer.parseInt(s2[1]),Integer.parseInt(s2[2]));
		addTimestamps(t1,t2);
	}
	Timestamp(int x,int y,int z)
	{
		hour = x;
		min = y;
		sec = z;
	}
	public static void addTimestamps(Timestamp x, Timestamp y)
	{
		int h,m,s,k=0;
		s = x.sec + y.sec;
		m = x.min + y.min;
		h = x.hour + y.hour;
		k = (int)s/60;
		s = s%60;
		m = m+k;
		k = (int)m/60;
		m = m%60;
		h = h+k;
		String str[] = new String[3];
		str[0] = h+"";
		str[1] = m+"";
		str[2] = s+"";
		for(int i=0;i<3;i++)
		{
			if(str[i].length()<2)
			str[i] = '0'+str[i];
		}
		System.out.println(str[0]+':'+str[1]+':'+str[2]);
	}
}
		