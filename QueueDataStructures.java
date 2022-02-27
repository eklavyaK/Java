import java.util.*;
class queue
{
	private int a[];
	int f,r,h=1;
	queue(int k)
	{
		a = new int[k];
		f = -1;
		r = 0;
	}
	public void ENQUEUE(int x)
	{
		a[++f]=x;
		if(r==f)
		h=1;
	}
	public void DEQUEUE()
	{
		r++;
		if(r>f)
		{
			h=0;
			if(r>f+1)
			r--;
		}
		if(r==f)
		h=1;
	}
	public void FRONT()
	{
		if(h!=0)
		System.out.print(a[r]+" ");
	}
	public void REAR()
	{
		if(h!=0)
		System.out.println(a[f]);
		else
		System.out.println();
	}
}
public class QueueDataStructures
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		queue o = new queue(n);
		String k = sc.nextLine();
		for(int i=1;i<=n;i++)
		{
			String s = sc.nextLine(), p = "";
			if(s.charAt(0)=='E')
			{
				for(int j = s.indexOf(' ')+1;j<s.length();j++)
				{
					p = p + s.charAt(j);
				}
				o.ENQUEUE(Integer.parseInt(p));
			}
			if(s.charAt(0)=='D')
			o.DEQUEUE();
			o.FRONT();
			o.REAR();
		}
	}
}