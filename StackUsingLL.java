import java.io.*;
import java.util.*;
public class StackUsingLL
{
    static class element
    {
        int value;
        element next;
        element(int a)
        {
            value = a;
            next = null;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = -1, n = sc.nextInt();
		ArrayList<element> list = new ArrayList<element>(n);
		String m = "", t = sc.nextLine();
		for(int i=0; i<n; i++)
		{
			String s = sc.nextLine(), r="";
			if(s.charAt(1)=='U')
			{
				for(int j = s.indexOf(' ')+1;j<s.length();j++)
				{
					if(s.charAt(j)==' ')
						break;
					r = r + s.charAt(j);
				}
				list.add(++k, new element(Integer.parseInt(r)));
				if(k>0)
				list.get(k-1).next = list.get(k);
			}
			if(s.charAt(1)=='O')
			{
				if(k==-1)
					break;
				list.add(k--, null);
				list.get(k).next = null;
			}
		}
		try
		{
			element p = list.get(0);
			while(p!=null)
			{
				m = p.value + " " + m + "";
				p = p.next;
			}  
			System.out.println(m);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("");
		}	
    }
}