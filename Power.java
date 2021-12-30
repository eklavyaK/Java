import java.util.*;
public class Power
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p=x;
        if(y!=0)
        for(int j=1;j<y;j++)
        {
            p*=x;
        }
        else
        p=1;
        System.out.println(p);
    }
}
