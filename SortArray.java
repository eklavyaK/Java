import java.util.*;
public class SortArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(), p=""; 
        int n=0, k=0, sum=0, i, j;
        int a=s.length();
        for(i=0;i<a;)
        {
            if(s.charAt(i)==' ')
            n++;
            i++;
        } 
        int m[]=new int[n+1];
        for(j=0;j<a;)
        {
			while(s.charAt(j)!=' ')
			{
				p=p+s.charAt(j);
				j++;
				if(j==a)
				break;
            }
			m[k]=Integer.parseInt(p);
			p="";
			k++;
			j++;
		}
		int b[]=sortArray(m);
		for(int l=0; l<b.length;l++)
		{
		System.out.print(b[l]+" ");
		}
	}
	public static int[] sortArray(int m[])
	{
		int k=0;
		for(int i=1;i<m.length;i++)
		{
			for(int j=0;j<m.length-i;j++)
			{
				if(m[j]>m[j+1])
				{
					k=m[j];
					m[j]=m[j+1];
					m[j+1]=k;
				}
			}
		}
		return m;
	}
}

				
				
			
			
			
			