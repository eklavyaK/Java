import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math;
public class testfile2
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
		if(n==1){out.println(1+"\n"+messages.get(0));out.close();System.exit(0);}
		int sum[][] = new int[n][3];
		int result = 0; int temp;
		float expectation = 0.0f;
		if(n>=20)
		{
			for(int i = 0;i<n;i++)
			{
				temp = 0;
				for(int j = 0;j<graph.get(i).size();j++)
					temp = temp + graph.get(i).get(j);
				result = result + temp;	
				sum[i][0]  = temp; sum[i][1] = i;
			}
		}
		else
		{
			for(int i = 0;i<n;i++)
			{
				temp = 0;
				for(int j = 0;j<graph.get(i).size();j++)
					temp = temp + Math.min(n,graph.get(i).get(j));
				result = result + temp;	
				sum[i][0]  = temp; sum[i][1] = i;
			}
		}
		int pins = n, cons = pins,test = 0;
		int newarray[][] = new int[cons][2], breakclone[] = new int[cons];
		expectation = (float)result/pins;
		Arrays.sort(sum,(arr1,arr2)->{return arr1[0]-arr2[0];});
		//for(int k=n-1; k>=n-cons; k--) out.println(messages.get(sum[n-1-k][1])+" "+sum[n-1-k][0]);
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
				cons = pins; pins=1;expectation=graph.get(sum[n-1][1]).size();
				result = (int)expectation;
				//breakclone = new int[cons];
				//out.println(expectation);
				for(int c = n-1;c>=n-cons;c--) {newarray[c][0] = graph.get(sum[c][1]).size(); 
					newarray[c][1] = sum[c][1];}
				Arrays.sort(newarray,(arr1,arr2)->{return arr2[0]-arr1[0];});
				while(pins<cons)
				{
					for(int clon = 0; clon<cons; clon++) breakclone[clon] = newarray[clon][1];
					//out.println();
					for(int k=n-1; k>=n-cons; k--)
					{
						temp = 0;
						//out.println(graph.get(sum[k][1]));
						for(int j=0; j<graph.get(sum[k][1]).size();j++)
						{
							if(graph.get(sum[k][1]).get(j)>=pins+1) temp = temp + pins+1;
							else temp = temp + graph.get(sum[k][1]).get(j);
						}
						newarray[n-1-k][0] = temp; newarray[n-1-k][1]=sum[k][1];
					}
					//for(int p = 0; p<n; p++) out.println(newarray[p][0]+" "+newarray[p][1]); out.println();
					//for(int p = 0; p<cons; p++) out.print(breakclone[p]+" "); out.println();
					Arrays.sort(newarray,(arr1,arr2)->{return arr2[0]-arr1[0];});
					//for(int p = 0; p<n; p++) out.print("("+p+" "+newarray[p][0]+" "+newarray[p][1]+")"+" "); out.println();
					int track=0; result=0;
					while(track<=pins)
						result = result + newarray[track++][0];
					if(expectation>(float)result/(pins+1)) 
					{
						out.println(pins);test = 1;
						for(int l = 0; l<pins;l++)
							out.print(messages.get(breakclone[l])+" ");
						break;
					}					
					else expectation = (float)result/++pins;
				}
				break;
			}
		}
		if(pins>20){
			out.println(pins);
			for(int i = n-1;i>=n-pins; i--)
					out.print(messages.get(sum[i][1])+" ");}
		else if(test==0){
			out.println(pins);test = 1;
			for(int l = 0; l<pins;l++)
				out.print(messages.get(breakclone[l])+" ");}
		out.close();
	}
}