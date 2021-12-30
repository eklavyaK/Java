import java.util.Scanner;
import java.util.Arrays;
public class ForbiddenSubsequences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.nextLine();
		while(n-->0)
		{
			String s = sc.nextLine();
			String t = sc.nextLine();
			String sorted = sortString(s);
			int len = s.length();
			int a=0,b=0,c=0;
			int index = 0;
			while(index<len && sorted.charAt(index)=='a')
			{index++;a++;}
			while(index<len && sorted.charAt(index)=='b')
			{index++;b++;}
			while(index<len && sorted.charAt(index)=='c')
			{index++;c++;}
			if(a==0||b==0||c==0){System.out.println(sorted);continue;}
			if(t.charAt(0)=='a'&&t.charAt(1)=='b'&&t.charAt(2)=='c')
				System.out.println(sorted.substring(0,a)+sorted.substring(a+b,a+b+c)+sorted.substring(a,a+b)+sorted.substring(a+b+c,len));
			else System.out.println(sorted);
		}
	}
	public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
