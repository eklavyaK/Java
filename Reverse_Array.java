import java.util.*;
public class Main
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
      int m[]=new int[n*2+1];
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
      for(int r=0;r<k;r++)
      {
         System.out.print(m[k-r-1]+" ");
      }
    } 
}
    