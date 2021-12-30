import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class MoamenAnd_K_subarrays
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt(), result = 0;
			int arr[] = new int[n];
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i = 0; i<n; i++)
			{arr[i] = sc.nextInt();map.put(arr[i],i);}
			int brr[] = arr.clone();
			Arrays.sort(brr);
			int temp_index = 0;
			for(int i = 0; i<n; i++)
			{
				int temp = 0; 
				int track = 0;
				temp_index = map.get(brr[i]);
				while(++temp_index<n && i + ++track<n && arr[temp_index] == brr[i+track]){temp++; continue;}
				result++;
				i = i + temp;
			}
			if(result>k)
				System.out.println("no");
			else System.out.println("yes");
		}
	}
}