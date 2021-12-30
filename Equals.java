import java.util.*;
class Equals
{
	int length;
	int width;
	int height;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String sa[] = sc.nextLine().split(" ");
		String sb[] = sc.nextLine().split(" ");
		Equals a = new Equals(Integer.parseInt(sa[0]),Integer.parseInt(sa[1]),Integer.parseInt(sa[2]));
		Equals b = new Equals(Integer.parseInt(sb[0]),Integer.parseInt(sb[1]),Integer.parseInt(sb[2]));
		System.out.println(a.Equals(b));
	}
	Equals(int a, int b, int c)
	{
		length = a;
		width = b;
		height = c;
	}
	public boolean Equals(Equals c)
	{
		int k = 0;
		if(length!=c.length)
		k=1;
		if(width!=c.width)
		k=1;
		if(height!=c.height)
		k=1;
		if(k==0)
		return true;
	    else
		return false;
	}
}