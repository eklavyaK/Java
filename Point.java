import java.util.*;
import java.lang.*;
import java.text.*;
public class Point
{
	double x_coordinate;
	double y_coordinate;
	public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		String s1[] = sc.nextLine().split(" ");
		Point p1 = new Point(Double.parseDouble(s1[0]),Double.parseDouble(s1[1]));
	    String s2[] = sc.nextLine().split(" ");
		Point p2 = new Point(Double.parseDouble(s2[0]),Double.parseDouble(s2[1]));
	    double x = p1.findDistance(p2);
		String str = x + "";
		if(str.indexOf('.')<str.length()-3)
		{
			DecimalFormat df = new DecimalFormat("######.00"); 
			System.out.println(df.format(x));
		}
		else
		System.out.println(x);
    }
	Point(double x_coordinates, double y_coordinates)
	{
		x_coordinate = x_coordinates; 
		y_coordinate = y_coordinates;
	}
	double findDistance(Point p)
	{
		double d = Math.sqrt(Math.pow((x_coordinate - p.x_coordinate),2) + Math.pow((y_coordinate - p.y_coordinate),2));
		return d;
	}
}