import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int a = strLen(s1);
        System.out.println(a);
    }
    public static int strLen(String s)
    {
        int n = 0,i = 0;
        char c;
        try
        {
            while(0==0)
            {
                c = s.charAt(i);
                i++;
            }
        }
        catch(StringIndexOutOfBoundsException e)
        {
            n=i;
        }
        return n;
    }
}