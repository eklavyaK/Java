import java.util.Scanner;
public class testfile
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m = 0, n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			int variety[] = new int[1];
			variety[0] = 0;
			int dishes = sc.nextInt();
			int ab[][] = new int[dishes][5];
			int result[][] = new int[dishes][2];
			for(int j = 0; j<dishes; j++)
			{
				ab[j][0] = sc.nextInt();     
				ab[j][1] = sc.nextInt();
				ab[j][2] = sc.nextInt();
				ab[j][3] = ab[j][0]+ab[j][1]-ab[j][2];
				if(j>0)
				{
					if(ab[j][3]>m)
						m=ab[j][3];
				}
				else
					m = ab[0][3];
			}
			while(m!=-1)
				m = compute(m,ab, dishes, variety, result);
			System.out.println(variety[0]);
			for(int j = 0; j<dishes; j++)
				System.out.println(result[j][0]+" "+result[j][1]);
		}
	}
	public static int compute(int m, int ab[][], int dishes, int variety[], int result[][])
	{
		int count[] = new int[m+1];
		for(int j = 0; j<dishes; j++)
		{
			if(ab[j][4]==0)
				count[ab[j][3]]++;
		}
		int smallest[][] = new int[m+1][6];
		for(int j = 0; j<dishes; j++)
		{
			if(ab[j][4]==0)
			{
				if(smallest[ab[j][3]][0]!=0)
				{
					if(smallest[ab[j][3]][4]>ab[j][0])
					{
						smallest[ab[j][3]][2]=j;
						smallest[ab[j][3]][4]=ab[j][0];
					}
				}
				else
				{
					smallest[ab[j][3]][0]=1;
					smallest[ab[j][3]][2]=j;
					smallest[ab[j][3]][4]=ab[j][0];
					
				}
				if(smallest[ab[j][3]][1]!=0)
				{
					if(smallest[ab[j][3]][5]>ab[j][1])
					{
						smallest[ab[j][3]][3]=j;
						smallest[ab[j][3]][5]=ab[j][1];
					}
				}
				else
				{
					smallest[ab[j][3]][1]=1;
					smallest[ab[j][3]][3]=j;
					smallest[ab[j][3]][5]=ab[j][1];
				}
			}
		}
		int first[][] = new int[m+1][3];
		int second[][] = new int[m+1][3];
		for(int j = 0; j<m+1; j++)
		{
			if(count[j]!=0)
			{
				if(ab[smallest[j][2]][1]-ab[smallest[j][2]][2]<0)
				{
					first[j][0] = ab[smallest[j][2]][0]+(ab[smallest[j][2]][1]-ab[smallest[j][2]][2]);
					second[j][0] = 0;
				}
				else
				{
					first[j][0] = ab[smallest[j][2]][0];
					second[j][0] = ab[smallest[j][2]][1]-ab[smallest[j][2]][2];
				}
				if(ab[smallest[j][3]][0]-ab[smallest[j][3]][2]<0)
				{
					first[j][1] = 0;
					second[j][1] = ab[smallest[j][3]][1]+(ab[smallest[j][3]][0]-ab[smallest[j][3]][2]);
				}
				else
				{
					first[j][1] = ab[smallest[j][3]][0]-ab[smallest[j][3]][2];
					second[j][1] = ab[smallest[j][3]][1];
				}
				variety[0]++;
			}
		}
		m = -1;
		for(int j = 0; j<dishes; j++)
		{
			if(ab[j][4]==0)
			{
				if(smallest[ab[j][3]][4]<smallest[ab[j][3]][5])
				{
					if((ab[j][0]-first[ab[j][3]][0]>=0) && (ab[j][1]-second[ab[j][3]][0]>=0))
					{
						result[j][0]=ab[j][0]-first[ab[j][3]][0];
						result[j][1]=ab[j][1]-second[ab[j][3]][0];
						ab[j][4]=1;
					}
					else
					{
						if((ab[j][0]-first[ab[j][3]][1]>=0) && (ab[j][1]-second[ab[j][3]][1]>=0))
						{
							result[j][0]=ab[j][0]-first[ab[j][3]][1];
							result[j][1]=ab[j][1]-second[ab[j][3]][1];
							if(first[ab[j][3]][2]==0)
								variety[0]++;
							first[ab[j][3]][2]=1;
							ab[j][4]=1;
						}
					}
				}
				else
				{
					if((ab[j][0]-first[ab[j][3]][1]>=0) && (ab[j][1]-second[ab[j][3]][1]>=0))
					{
						result[j][0]=ab[j][0]-first[ab[j][3]][1];
						result[j][1]=ab[j][1]-second[ab[j][3]][1];
						ab[j][4]=1;
					}
					else
					{
						if((ab[j][0]-first[ab[j][3]][0]>=0) && (ab[j][1]-second[ab[j][3]][0]>=0))
						{
							result[j][0]=ab[j][0]-first[ab[j][3]][0];
							result[j][1]=ab[j][1]-second[ab[j][3]][0];
							if(first[ab[j][3]][2]==0)
								variety[0]++;
							first[ab[j][3]][2]=1;
							ab[j][4]=1;
						}
					}
				}
			}
			if(ab[j][4]==0 && ab[j][3]>m)
				m = ab[j][3];
		}
		return m;
	}
}

