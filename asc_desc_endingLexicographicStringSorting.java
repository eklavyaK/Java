import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
public class asc_desc_endingLexicographicStringSorting
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = n%2;
		if(n==1){
		System.out.println(1); System.exit(0);}
		if(n==2){
		System.out.println(1+" "+2); System.exit(0);}
		String tem = sc.nextLine();
		String bookseven[] = new String[(n-r)/2];
		int even[] = new int[(n-r)/2];
		String booksodd[] = new String[(n+r)/2];
		int odd[] = new int[(n+r)/2];
		int track = 0;
		for(int i = 0; i<n;)
		{
			if(i%2==0){booksodd[i++/2] = sc.nextLine(); odd[(i-1)/2] = ++track; continue;}
			else{bookseven[i++/2] = sc.nextLine(); even[(i-1)/2] = ++track;}
		}
		int temp = 0;
		for(int i = 0; i<booksodd.length-1;i++)
			for(int j = 0; j<booksodd.length-i-1;j++)
			{
				int val = compare(m, booksodd[j],booksodd[j+1]);
				if(val==0)
					continue;
				else if(val<0)
					continue;
				else
				{ 
					temp = odd[j];
					odd[j] = odd[j+1];
					odd[j+1] = temp;
				}
			}
		temp = 0; 
		for(int i = 0; i<bookseven.length-1;i++)
			for(int j = 0; j<bookseven.length-i-1;j++)
			{
				int val = compare(m, bookseven[j],bookseven[j+1]);
				if(val==0)
					continue;
				else if(val>0)
					continue;
				else
				{ 
					temp = even[j];
					even[j] = even[j+1];
					even[j+1] = temp;
				}
			}
		for(int i = 0; i<n;)
		{
			if(i%2==0){System.out.print(odd[i++/2]+" "); continue;}
			else{System.out.print(even[i++/2]+" ");}
		}
	}
	public static int compare(int m, String a, String b)
	{
		int k = 0;
		for(int i = 0; i<m; i++)
			if(a.charAt(i) != b.charAt(i))
			{k = a.charAt(i) - b.charAt(i); break;}
			return k;
	}
}