import java.util.*;
public class SortingCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][2];
		for(int i = 0; i<n; i++)
		{
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		for(int i = 0; i<10;i++){
			Arrays.sort(a,(a1,a2)->{return a1[0] - a2[0];});
			for(int j =0;j<n;j++)
				System.out.println(a[j][0]+" "+a[j][1]);
			System.out.println();
		}
	}
}