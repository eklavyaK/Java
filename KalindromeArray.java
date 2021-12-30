import java.util.Scanner;
import java.lang.Math;
public class KalindromeArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int length = sc.nextInt();	
			int a[] = new int[length];
			for(int i = 0; i<length; i++)
				a[i] = sc.nextInt();
			if(length<3)
			{
				System.out.println("YES");
				continue;
			}
			if(length==3)
			{
				if(a[0]!=a[1] && a[1]!=a[2] && a[2]!=a[0])
					System.out.println("NO");
				else System.out.println("YES");
				continue;
			}
			int start = 0, end = length-1;
			int omit[] = new int[2];
			int track[] = new int[1];
			boolean result = solve(a, start, end, omit, track);
			if(result)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	public static boolean solve(int a[], int start, int end, int omit[], int track[])
	{
		int  startx_endcount = 0, endx_startcount = 0, startx_startcount = 0, endx_endcount = 0, k = 0, l = 0, z = 0, en = 0, st = 0, startx = 0, endx = 0;
		while(start<=end)
		{
			if(a[start] == a[end])
			{
				start++;
				end--;
			}
			else
			{
				startx = a[start];
				startx_startcount++;
				endx = a[end];
				endx_endcount++;
				break;
			}
		}
		en = end;
		st = start;
		if(startx == 0)
			return true;
		else if(track[0]>0&&((startx != omit[0] && endx != omit[1])||(startx != omit[1] && endx != omit[0])))
			return false;
		else if(end-start<=1)
			return true;
		else
		{
			if(track[0]==0){
			omit[0] = startx;
			omit[1] = endx;track[0]++;}
			int y = start+1;
			int nextintstart=-1, nextintend=-2, location_start = -1, location_end = -2;
			while(y<end)
			{
				if(a[y]==startx)
					startx_startcount++;
				else if(a[y]==endx)
					endx_startcount++;
				else
				{k=1;location_start = y; nextintstart=a[y];break;}
				y++;
			}
			int x = end - 1;
			while(x>start)
			{
				if(a[x]==endx)
					endx_endcount++;
				else if(a[x]==startx)
					startx_endcount++;
				else
				{l=1;location_end = x; nextintend=a[x];break;}
				x--;
			}
			if(k == 0 && l == 0)
				return true;
			if(k==1 && l==1 && nextintstart!=nextintend)
				return false;
			else
			{
				if(startx_endcount == startx_startcount && endx_startcount == endx_endcount)
				{
					if(location_start == location_end){return true;}
					else
						return solve(a, location_start, location_end, omit, track);
				}
				else if(startx_endcount == startx_startcount)
				{ 
					int d = endx;
					while(st<=en)
					{
						if(a[st] == a[en])
						{st++;en--;}
						else if(a[st] == d)
							st++;
						else if(a[en] == d)
							en--;
						else{
						z = 1; break;}
					}
					if(z!=1) return true;
					else return false;
				}
				else if(endx_startcount == endx_endcount)
				{
					int d = startx;
					while(st<=en)
					{
						if(a[st] == a[en])
						{st++;en--;}
						else if(a[st] == d)
							st++;
						else if(a[en] == d)
							en--;
						else{
						z = 1; break;}
					}
					if(z!=1) return true;
					else return false;
				}
				else return false;
			}
		}
	}
}