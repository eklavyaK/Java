import java.io.*;
import java.util.*;
public class ReplaceChar
{
	public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char c1 = s2.charAt(0), c2 = s2.charAt(2);
        String s3 = replcString(s1, c1, c2);
        System.out.println(s3);
    }
    public static String replcString(String s, char c1, char c2)
    { 
        String s0 = "";
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)==c1)
            s0 = s0 + c2;
            else
            s0 = s0 + s.charAt(i);
        }  
        return s0;
    }
}