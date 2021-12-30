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
        ArrayList<Node> list = new ArrayList<Node>(n);
        for(int i=0; i<n; i++)
        list.add(i, new Node(sc.nextInt()));
        for(int k=0; k<n-1; k++)
        {
        list.get(k).next = list.get(k+1);
        }
        Node p = list.get(0);
        while(p!=null)
        {
            System.out.print(p.key + " ");
            p = p.next;
        }
    }
}