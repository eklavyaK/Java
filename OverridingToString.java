import java.util.*;
class OverridingToString
{
	int length;
	int width;
	int height;
	OverridingToString(int a, int b ,int c)
	{
		length = a;
		width = b;
		height = c;
	}
	public String toString()
	{
		return "Length = "+length+", Width = "+width+", Height = "+height;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		OverridingToString b = new OverridingToString(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
		System.out.println(b);
	}
}