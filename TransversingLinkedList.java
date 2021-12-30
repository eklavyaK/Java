import java.io.*;
import java.util.*;
public class TransversingLinkedList
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
		Node Num[] = new Node[n];
		for(int i=0; i<n; i++)
		Num[i] = new Node(sc.nextInt());
		for(int k=0; k<n-1; k++)
		{
		Num[k].next = Num[k+1];
		}
		Node p = Num[0];
		while(p!=null)
		{
			System.out.print(p.key + " ");
			p = p.next;
		}
	}
}