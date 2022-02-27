import java.util.*;
public class Tut2Question2
{
    static class Node
    {
        int key;
        Node next;
        Node(int a)
        {
            key = a;
            next = null;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Node> list = new ArrayList<Node>(n);
        for(int i=0; i<n; i++)
        list.add(i, new Node(sc.nextInt()));
		for(int r=0; r<n-1; k++)
		{
			list.get(r).next = list.get(r+1);
		}
		Node Head = null, head = list.get(0);
		Node p = head;
		int t = (int)(n/k);
		Node temp[] = new Node[t];
		int s = n % k;
		int i = 0;
		while(i<t)
		{
			Node temp1 = null;
			Node temp2 = null;
			int j = 0;
			while(j<k)
			{ 
				if(j==0)
					temp[i] = p;
				temp1 = p.next;
				p.next = temp2;
				temp2 = p;
				p = temp1;
				j++;
			}
			if(i!=0)
				temp[i-1].next = temp2;
			if(i==0)
			{
				Head = temp2;
			}
		}
		temp[i].next = p;
		System.out.println(list);
        while(Head!=null)
        {
            System.out.print(Head.key + " ");
            Head = Head.next;
        }
	}
}		