import java.util.*;
import java.lang.*;
public class Decimal_to_Binary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i=0,y,a,z=0;
        while(x!=1)
        {
            y=power(10,i);
            a=x%2;
            x=(int)x/2;
            z=z+a*y;
            i++;
        }
        y=power(10,i);
        a=x%2;
        x=(int)x/2;
        z=z+a*y;
        i++;
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