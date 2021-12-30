import java.util.*;
public class Binary_to_Decimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i=0,y,a=x,z;
		double n=0;
		if(x!=0)
		{
			while(a!=0)
			{
				i++;
				y=(int)power(10,i);
				a=(int)x/y;
			}
			for(z=1;z<=i;z++)
			{	
				y=(int)power(10,i-z);
				a=(int)x/y;
				x=x%y;
				n=n+a*power(2,i-z);
			}
		}
		int m=(int)n;
		System.out.println(m);
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