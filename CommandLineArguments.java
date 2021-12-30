import java.util.*;
public class CommandLineArguments
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String arr[] = sc.nextLine().split(" ");
		args=arr;
		if(args[1].charAt(0)=='+')
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[2]));
		if(args[1].charAt(0)=='-')
		System.out.println(Integer.parseInt(args[0])-Integer.parseInt(args[2]));
		if(args[1].charAt(0)=='*')
		System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[2]));
		if(args[1].charAt(0)=='/')
		System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[2]));
		if(args[1].charAt(0)=='%')
		System.out.println(Integer.parseInt(args[0])%Integer.parseInt(args[2]));
	}
}