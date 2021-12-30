import java.util.*;
class Stack
{
	private int a[];
	int t;
	Stack(int k)
	{
		a = new int[k];
		t = -1;
	}
	public void PUSH(int x)
	{
		a[++t]=x;
	}
	public void POP()
	{
		t--;
	}
	public void TOP()
	{
		if(t!=(-1))
		System.out.println(a[t]);
		else
		System.out.println();
	}
}
public class StackDataStructure
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		Stack o = new Stack(n);
		String p = sc.nextLine();
		for(int i=1;i<=n;i++)
		{
			String s = sc.nextLine(), r="";
			if(s.charAt(1)=='U')
			{
				for(int j = s.indexOf(' ')+1;j<s.length();j++)
				{
					r = r + s.charAt(j);
				}
				o.PUSH(Integer.parseInt(r));
			}
			if(s.charAt(1)=='O')
			o.POP();
			o.TOP();
		}
	}
}