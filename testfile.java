import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class testfile
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int sum = 0, temp = 0, k = 0, n = Integer.parseInt(br.readLine());
		int message[][] = new int[n][2];
		float expectation = 0.0f;
		int count[][] = new int[200001][2];
		int store[][] = new int[200000][4];
		for(int i = 0; i<n; i++)
		{
			String input[] = br.readLine().split(" ");
			message[i][0] = Integer.parseInt(input[0]);
			message[i][1] = Integer.parseInt(input[1]);
			if(count[message[i][0]][0] == 0)
			{
				count[message[i][0]][1] = k;
				count[message[i][0]][0] = 1;
				store[k][0] = message[i][0];
				store[k][1] = message[i][1];
				store[k][3] = k;
				k++;
			}
			else
				store[count[message[i][0]][1]][1] = store[count[message[i][0]][1]][1] + message[i][1];
		}
		int a[]= new int[k];
		for(int i = 0; i<k; i++)
		{
			temp = 0;
			int b= 0;
			for(int j = 0; j<k; j++)
			{
				if(store[j][1]<store[i][1])
					temp++;
				if(store[j][1]==store[i][1])
					if(j<i)
						b++;
			}
			a[temp+b]=i;
		}
		int pins = k;
		if(pins>20)
		{
			for(int i = 0; i<k;i++)
				sum = sum + store[i][1];
			expectation = (float)sum/k;
			for(int i = 0; i<k;i++)
				if(expectation>store[a[i]][1] && store[a[i]][2]!=1)
				{
					if(pins<=20)
					{
						pins = func(expectation, a, n, k, pins, count, store, message);
						break;
					}
					else
					{
						pins = pins - 1;
						sum = sum - store[a[i]][1];
						store[a[i]][2] = 1;
						expectation = (float)sum/pins;
					}
				}
		}
		else
			pins = func(expectation, a, n, k, pins, count, store, message);
		System.out.println(pins);
		for(int i = 0; i<k; i++)
			if(store[i][2]==0)
				System.out.print(store[i][0]+" ");
	}
	public static int func(float expectation, int a[], int n, int k, int pins, int count[][], int store[][], int message[][])
	{
		int sum = 0;
		for(int i = 0; i<n;i++)
			if(store[count[message[i][0]][1]][2] != 1)
				sum = sum + Math.min(message[i][1],pins);
		expectation = (float)sum/pins;
		for(int i = 0; i<k;i++)
			if(store[a[i]][2]!=1 && expectation>store[a[i]][1])
			{
				sum = 0;
				for(int j = 0; j<n; j++)
					if(store[a[i]][0] != message[j][0] && store[count[message[j][0]][1]][2] != 1)
						sum = sum + Math.min(message[j][1], pins-1);
				if((float)sum/(pins-1)<=expectation)
					break;
				else
				{
					expectation = (float)sum/(pins-1);
					store[a[i]][2] = 1;
					pins = pins - 1;
				}
			}
		return pins;
	}
}