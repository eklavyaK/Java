import java.io.InputStreamReader
import java.io.BufferedReader
import java.lang.String;
public class asc_desc_endingLexicographicCharacterSorting
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String tem = br.readLine();
		String books[] = new String[n];
		for(int i = 0; i<n;i++)
		{books[i] = br.readLine()+""+(i+1);}
		String t = "";
		for(int j = 0; j<n-1;j++)
		{
			for(int k = 0; k<n-j-1; k++)
			{
				for(int i = 0;i<m;i++)
				{
					if(books[k].charAt(i) != books[k+1].charAt(i))
					{
						if(i%2==0)
						{
							if(books[k].charAt(i) > books[k+1].charAt(i))
							{
								t = books[k];
								books[k] = books[k+1];
								books[k+1] = t;
							}
						}
						else
						{
							if(books[k].charAt(i) < books[k+1].charAt(i))
							{
								t = books[k];
								books[k] = books[k+1];
								books[k+1] = t;
							}
						}
						break;
					}
				}
			}
		}
		for(int i = 0; i<n; i++)
			System.out.print(books[i].substring(m)+" ");
	}
}