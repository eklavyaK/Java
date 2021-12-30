import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
public class ShiftingSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = sc.nextLine();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for(int i = 0;i<n;i++) a[i] = sc.nextInt();
			b = a.clone();
			Arrays.sort(b);
			int k = n-1, d = 1, count=0;
			String result = "";
			while(true)
			{
				int l = 0, r = 0;
				if(Arrays.equals(a,b))
					break;
				else{
					while(a[k]==b[k])
						k--;
					r = k;
					for(int i = 0;i<k; i++)
					{if(b[k]==a[i]){ l = i; break;}}
					int temp = a[l];
					for(int i = l; i<k;i++) a[i] = a[i+1];
					a[r] = temp;
					result = result + (l+1)+" "+(r+1)+" "+1+"\n";
					count++;
				}
			}
			System.out.println(count);
			System.out.println(result.trim());
		}
	}
}