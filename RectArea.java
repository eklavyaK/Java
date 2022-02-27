import java.util.*;
public class RectArea
{
	double length;
	double width;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		RectArea r1 = new RectArea();
		RectArea r2 = new RectArea(sc.nextInt());
		RectArea r3 = new RectArea(sc.nextDouble(),sc.nextDouble());
		r2.calculate();
		r3.calculate();
	}
	RectArea()
	{
		width = 0;
		length = 0;
	}
	RectArea(int a)
	{
		width = a;
		length = a;
	}
	RectArea(double x, double y)
	{
		width = y;
		length = x;
	}
	void calculate()
	{
		System.out.println(length*width);
	}
}