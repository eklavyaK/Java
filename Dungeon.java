import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.lang.Math;
import java.util.HashMap;
public class Dungeon
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s[] = br.readLine().split(" ");
			int hp[] = new int[3];
			hp[0] = Integer.parseInt(s[0]);
			hp[1] = Integer.parseInt(s[1]);
			hp[2] = Integer.parseInt(s[2]);
			if(hp[0]+hp[1]+hp[2]==9){out.println("yes");continue;}
			if((hp[0]+hp[1]+hp[2])%9==0)
			{
				Arrays.sort(hp);
				int diff = 0, rem = 0, en_shot = 0;
				while(hp[2] != hp[1])
				{
					diff = hp[2]-hp[1];
					rem = diff%7;
					en_shot = diff/7;
					if(en_shot==0) break;
					hp[1] = hp[1] - en_shot;
					hp[0] = hp[0] - en_shot;
					hp[2] = hp[2] - diff + rem;
				}
				if(hp[0]+hp[1]+hp[2]==9){out.println("yes");continue;}
				hp[2] = hp[2] - rem;
				if(7-rem%2==0)
				{
					hp[0] = hp[0] - 2;
					hp[2] = hp[2] - ((7-rem)/2-1);
				}
				else
				{
					hp[0] = hp[0] - 1;
					hp[2] = hp[2] - ((7-rem)/2+(7-rem)%2);
				}
				hp[1] = hp[2];
				if(hp[0]<=0 && hp[1]!=0)
					out.println("no");
				else
				{
					while(true)
					{
						diff = hp[2] - hp[0];
						en_shot = diff/4;
						rem = diff%4;
						if(en_shot==0) break;
						hp[2] = hp[2] - diff+rem;
						hp[1] = hp[2];
						hp[0] = hp[0] - en_shot;
					}
					if(hp[0]<=0) out.println("no");
					else if((hp[0] + hp[1] + hp[2])%9!=0) out.println("yes");
					else out.println("yes");
				}
			}
			else out.println("no");
		}
		out.close();
	}
}