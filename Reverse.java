import java.util.*;
public class Reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int a = Integer.parseInt(s);
        int i,x,y,z=0;
        for(i=1;i<=n;)
        {
            y=(int)power(10,n-i);
            x=(int)a/y;
            a=a%y;
            y=(int)power(10,i-1);
            z=z+x*y;
            i++;
        }
        System.out.println(z);
    }
    public static int power(int k, int l)
    {
        int p=k;
        if(l!=0)
        for(int j=1;j<l;j++)
        {
            p*=k;
        }
        else
        return 1;
        return p;
    }
}