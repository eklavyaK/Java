import java.util.*;
public class Trim
{

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = rmvSpaces(s1);
        System.out.println(s2);
    }
    public static String rmvSpaces(String s)
    {
        String s0 = "";
        int i = 0;
        while(s.charAt(i)==' ')
        {
            i++;
        }
        int k = 0;
        while(s.charAt(s.length()-1-k)==' ')
        { 
            k++;
        }
        for(int a = i; a<s.length()-k;a++)
        {
            s0 = s0 + s.charAt(a);
        }
        return s0;
    }
    
}