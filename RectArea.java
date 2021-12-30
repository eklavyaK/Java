import java.util.*;
public class Rectangle
{
	double length;
	double width;
	public static void main(String args[])
	{
		Scanner sc = new scanner(System.in);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(sc.nextInt());
		Rectangle r3 = new Rectangle(sc.nextDouble(),sc.nextDouble());
		r2.calculate();
		r3.calculate();
	}
	Rectangle()
	{
		width = 0;
		length = 0;
	}
	Rectangle(int a)
	{
		width = a;
		length = a;
	}
	Rectangle(double x, double y)
	{
		width = y;
		length = x;
	}
	void calculate()
	{
		System.out.println(length*width);
	}
}