import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class TrashFile1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][2];
			int diff[][] = new int[n][2];
			int track[] = new int[n];
			for(int i = 0;i<n;i++)
			{
				String input[] = br.readLine().split(" ");
				arr[i][0] = Integer.parseInt(input[0]);
				arr[i][1] = Integer.parseInt(input[1]);
			}
			for(int i = 0;i<n;i++)
			{
				int dif = arr[i][1]-arr[i][0];
				if(track[dif]==0)
				{diff[dif][0]=i;track[dif]=1;diff[dif][1] = -1;}
				else diff[dif][1]=i;
			}
			int last[] = new int[2],lasttrack=0;
			int index = 0;
			for(int i = 0;i<n-1;i++)
			{
				if(track[i]==1)
				{
					int k = 0;
					index = diff[i][0];
					int p_range=diff[i+1][0];
					if((arr[p_range][0]==arr[index][0]-1)&&arr[p_range][1]==arr[index][1])
					{out.println(arr[index][0]+" "+arr[index][1]+" "+arr[p_range][1]);k=1;}
				
					else if((arr[p_range][0]==arr[index][0])&&arr[p_range][1]==arr[index][1]+1)
					{out.println(arr[index][0]+" "+arr[index][1]+" "+arr[p_range][0]);k=1;}
				
					p_range=diff[i+1][1];
					if(p_range!=-1)
					{
						if((arr[p_range][0]==arr[index][0]-1)&&arr[p_range][1]==arr[index][1])
						{out.println(arr[index][0]+" "+arr[index][1]+" "+arr[p_range][1]);k=1;}
						
						else if((arr[p_range][0]==arr[index][0])&&arr[p_range][1]==arr[index][1]+1)
						{out.println(arr[index][0]+" "+arr[index][1]+" "+arr[p_range][0]);k=1;}
					}
					if(k==0)
						last[lasttrack++]=diff[i][0];
					
					if(diff[i][1]!=-1)
					{
						index = diff[i][1];
						p_range = diff[i+1][0];
						if((arr[p_range][0]==arr[index][0]-1)&&arr[p_range][1]==arr[index][1])
						{out.println(arr[index][0]+" "+arr[index][1]+" "+arr[p_range][1]);k=1;}
					
						if((arr[p_range][0]==arr[index][0])&&arr[p_range][1]==arr[index][1]+1)
						{out.println(arr[index][0]+" "+arr[index][1]+" "+arr[p_range][0]);k=1;}
					
						p_range=diff[i+1][1];
						if(p_range!=-1)
						{
							if((arr[p_range][0]==arr[index][0]-1)&&arr[p_range][1]==arr[index][1])
							{out.println(arr[index][0]+" "+arr[index][1]+" "+arr[p_range][1]);k=1;}
							
							if((arr[p_range][0]==arr[index][0])&&arr[p_range][1]==arr[index][1]+1)
							{out.println(arr[index][0]+" "+arr[index][1]+" "+arr[p_range][0]);k=1;}
						}
						if(k==0)
							last[lasttrack++]=diff[i][1];
					}
				}
			}
			if(lasttrack==2)
			{
				if(arr[last[0]][0]<arr[last[1]][0])
				{
					int i = n-arr[last[1]][0];
					if(i==0)
						out.println(n+" "+n+" "+n);
					else
						for(int j = i-1;j>=0;j--)
						{
							if(track[j]==1)
							{
								if(arr[diff[j][0]][0]==arr[last[1]][0])
									out.println(arr[last[1]][0]+" "+n+" "+(arr[diff[j][0]][1]+1));
								else if(arr[diff[j][0]][1]==n)
									out.println(arr[last[1]][0]+" "+n+" "+(arr[diff[j][0]][0]-1));
								else if(diff[j][1]!=-1)
								{
									if(arr[diff[j][1]][0]==arr[last[1]][0])
										out.println(arr[last[1]][0]+" "+n+" "+(arr[diff[j][1]][1]+1));
									else if(arr[diff[j][1]][1]==n)
										out.println(arr[last[1]][0]+" "+n+" "+(arr[diff[j][1]][0]-1));
								}
							}
						}
					i = arr[last[0]][1]-1;
					if(i==0)
						out.println(1+" "+1+" "+1);
					else
						for(int j = i-1;j>=0;j--)
						{
							if(track[j]==1)
							{
								if(arr[diff[j][0]][0]==1)
									out.println(1+" "+arr[last[0]][1]+" "+(arr[diff[j][0]][1]+1));
								else if(arr[diff[j][0]][1]==arr[last[0]][1])
									out.println(1+" "+arr[last[0]][1]+" "+(arr[diff[j][0]][0]-1));
								else if(diff[j][1]!=-1)
								{
									if(arr[diff[j][1]][0]==1)
										out.println(1+" "+arr[last[0]][1]+" "+(arr[diff[j][1]][1]+1));
									else if(arr[diff[j][1]][1]==arr[last[0]][1])
										out.println(1+" "+arr[last[0]][1]+" "+(arr[diff[j][1]][0]-1));
								}
							}
						}
					out.println(1+" "+n+" "+(arr[last[1]][0]-1));
				}
				else 
				{
					int i = n-arr[last[0]][0];
					if(i==0)
						out.println(n+" "+n+" "+n);
					for(int j = i-1;j>=0;j--)
					{
						if(track[j]==1)
						{
							if(arr[diff[j][0]][0]==arr[last[0]][0])
								out.println(arr[last[0]][0]+" "+n+" "+(arr[diff[j][0]][1]+1));
							else if(arr[diff[j][0]][1]==n)
								out.println(arr[last[0]][0]+" "+n+" "+(arr[diff[j][0]][0]-1));
							else if(diff[j][1]!=-1)
							{
								if(arr[diff[j][1]][0]==arr[last[0]][0])
									out.println(arr[last[0]][0]+" "+n+" "+(arr[diff[j][1]][1]+1));
								else if(arr[diff[j][1]][1]==n)
									out.println(arr[last[0]][0]+" "+n+" "+(arr[diff[j][1]][0]-1));
							}
						}
					}
					i = arr[last[1]][1]-1;
					if(i==0)
						out.println(1+" "+1+" "+1);
					else
						for(int j = i-1;j>=0;j--)
						{
							if(track[j]==1)
							{
								if(arr[diff[j][0]][0]==1)
									out.println(1+" "+arr[last[1]][1]+" "+(arr[diff[j][0]][1]+1));
								else if(arr[diff[j][0]][1]==arr[last[1]][1])
									out.println(1+" "+arr[last[1]][1]+" "+(arr[diff[j][0]][0]-1));
								else if(diff[j][1]!=-1)
								{
									if(arr[diff[j][1]][0]==1)
										out.println(1+" "+arr[last[1]][1]+" "+(arr[diff[j][1]][1]+1));
									else if(arr[diff[j][1]][1]==arr[last[1]][1])
										out.println(1+" "+arr[last[1]][1]+" "+(arr[diff[j][1]][0]-1));
								}
							}
						}
					out.println(1+" "+n+" "+(arr[last[0]][0]-1));
				}
			}
			else
			{
				if(arr[last[0]][0]==1)
					out.println(1+" "+n+" "+1);
				else out.println(1+" "+n+" "+n);
			}
			out.println();
		}			
		out.close();
	}
}