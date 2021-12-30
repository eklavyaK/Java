import java.util.*;
abstract class BoxH
{
	int height;
	public abstract void printDimentions();
}
abstract class BoxW extends BoxH
{
	int width;
	public abstract void printDimentions();
}
abstract class BoxD extends BoxW
{
	int depth;
	public abstract void printDimentions();
}
class Box extends BoxD
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		Box b = new Box(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
		b.printDimentions();
	}
	Box(int a,int b,int c)
	{
		width = a;
		height = b;
		depth = c;
	}
	public void printDimentions()
	{
		System.out.println("WIDTH="+width);
		System.out.println("HEIGHT="+height);
		System.out.println("DEPTH="+depth);
	}
}