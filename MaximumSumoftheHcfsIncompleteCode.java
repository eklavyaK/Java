import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class MaximumSumoftheHcfsIncompleteCode
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();	
		int a[] = new int[length];
		for(int i = 0; i<length; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int r = length-1;
		int hcfr = a[r];
		int result = hcfr;
		r--;
		while(r>0)
		{
			int k = 0, temp = 0;
			int temp_hcf = 0, temp_hcfr = 0, start_index = 0, end_index = 0, sum = 0, sum_temp_hcfr = 0;
			for(int i = r; i>=0;i--)
			{
				int j = 1;
				temp_hcf = hcf(hcfr,a[i]);
				sum = temp_hcf;
				while(i>0 && a[i]==a[i-j])
					sum = temp_hcf*(++j);
				if(sum_temp_hcfr<sum)
				{
					start_index = i;
					end_index = i-(--j);
					temp_hcfr = temp_hcf;
					sum_temp_hcfr = sum;
				}
				i=i-j;
				sum = 0;
			}
			hcfr = temp_hcfr;
			result = result + sum_temp_hcfr;
			int n = start_index-end_index+1;
			for(int i = 0; i<n; i++){
				temp = a[start_index-i];
				for(int j=0;j<r-start_index;j++)
					a[start_index-i+j] = a[start_index-i+j+1];
				a[r]=temp;r--;}
		}
		System.out.println(result);
	}
	public static int hcf(int a1,int b1)
	{
		int a = Math.max(a1,b1);
		int b = Math.min(a1,b1);
		while (b > 0)
		{
			int temp = b;
			b = a % b; 
			a = temp;
		}
		return a;
	}
}