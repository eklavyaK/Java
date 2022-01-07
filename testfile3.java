import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math;
public class testfile
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		//int stuinfo[][] = new int[t][2];
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> messages = new HashMap<Integer,Integer>();
		int a = 0, b = 0, n = 0;
		for(int i = 0;i<t;i++)
		{
			String input[] = br.readLine().split(" ");
			a = Integer.parseInt(input[0]);
			b = Integer.parseInt(input[1]);
			if(map.get(a)==null) 
			{
				map.put(a,n); messages.put(n,a);
				graph.add(new ArrayList<Integer>());
				graph.get(n).add(b);n++;
			}
			else graph.get(map.get(a)).add(b);
		}
		int sum[][] = new int[n][3];
		int result = 0;
		float expectation = 0.0f;
		if(n>=20)
			for(int i = 0;i<n;i++)
			{
				int temp = 0;
				for(int j = 0;j<graph.get(i).size();j++)
					temp = temp + graph.get(i).get(j);
				result = result + temp;	
				sum[i][0]  = temp; sum[i][1] = i;
			}
		else
			for(int i = 0;i<n;i++)
			{
				int temp = 0;
				for(int j = 0;j<graph.get(i).size();j++)
					temp = temp + Math.min(n,graph.get(i).get(j));
				result = result + temp;	
				sum[i][0]  = temp; sum[i][1] = i;
			}
		int pins = n, cons = pins; int p = pins;
		expectation = (float)result/pins;
		Arrays.sort(sum,(arr1,arr2)->{return arr1[0]-arr2[0];});
		//for(int k=n-1; k>=n-cons; k--) out.println(sum[n-1-k][0]+" "+messages.get(sum[n-1-k][1]));
		for(int i = 0; i<n; i++)
		{
			if(pins>20)
			{
				if(expectation>sum[i][0])
				{result = result-sum[i][0]; expectation =(float)result/(--pins);}
				else break;
			}
			else
			{
				cons = pins; p = pins;
				result = result - sum[n-cons][0]; int loc = n-cons;
				sum[n-cons][2]=1;
				while(pins>0)
				{
					for(int k=n-1; k>=n-cons; k--)
						if(sum[k][2]!=1)
							for(int j=0; j<graph.get(sum[k][1]).size();j++)
								if(graph.get(sum[k][1]).get(j)>pins-1)
								{result = result - 1; sum[k][0] = sum[k][0] - 1;}
					if(expectation<(float)result/(pins-1)) 
					{
						expectation = (float)result/(pins - 1);
						int min = sum[n-1][0];loc=n-1;
						for(int f = n-2;f>=n-cons;f--)
							if(min>sum[f][0]&&sum[f][2]==0){min = sum[f][0];loc = f;} 
						//out.println(loc+" "+min);
						sum[loc][2]=1; result = result - sum[loc][0];pins--;p = pins
					}					
					else {
						int min = sum[n-1][0];loc=n-1;
						for(int f = n-2;f>=n-cons;f--)
							if(min>sum[f][0]&&sum[f][2]==0){min = sum[f][0];loc = f;} 
						//out.println(loc+" "+min);
						sum[loc][2]=1; result = result - sum[loc][0];}
				}
				break;
			}
		}
		if(pins<=20){
		out.println(p);
				for(int i = n-1;i>=n-cons;i--){
					if(sum[i][2]==0)
						out.print(messages.get(sum[i][1])+" ");}}
		else{
		out.println(pins);
			for(int i = n-1;i>=n-pins; i--)
					out.print(messages.get(sum[i][1])+" ");}
		out.flush();		
	}
}