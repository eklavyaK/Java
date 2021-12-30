import java.util.*;
import java.io.*;
class PA20116032
{
	public static void main(String args[]) throws IOException 
	{
		
		File tlbaf = new File(".//" + args[0]);
		File ptf = new File(".//" + args[1]);
		int k = Integer.parseInt(args[3]);
		int tlb[][] = new int[k][2];
		int tlba[] = new int [k];
		Scanner file1 = new Scanner(tlbaf);
		Scanner file2 = new Scanner(ptf);
		int ptarvpn[] = new int[11000];
		int ptarpfn[] = new int[11000];
		String str = "", temp = "", tempfn = "";
		int u = 0;
		while(file2.hasNextLine())
		{
			String q = file2.nextLine();
			if(u<3)
			{
				u++;
				continue;
			}
			String ar[] = file2.nextLine().split("      ");
			ptarvpn[u - 3] = Integer.parseInt(ar[0]);
			ptarpfn[u - 3] = Integer.parseInt(ar[1]);
			u++;
		}
		int i = 1, x = 0, t = 0, ta = 0, tm = 0, th = 0, p = 0, pa = 0;
		if(args[2].equals("MRU"))
		{
			int mru = 0;
			while(file1.hasNextLine())
			{
				p = 0;
				if(i==1)
				{
					x = Integer.parseInt(file1.nextLine());
					i++;
					continue;
				}
				int n = Integer.parseInt(file1.nextLine());
				String m = Integer.toBinaryString(n);
				String r2 = m.substring(m.length() - x);
				String r1 = m.substring(0, m.length() -x);
				int R1 = Integer.parseInt(r1,2);
				for(int j = 0; j<k; j++)
				{
					if(tlb[j][0] == R1)
					{
						t++;
						th++;
						tempfn = Integer.toBinaryString(tlb[j][1]);
						temp = tempfn + r2;
						pa = Integer.parseInt(temp,2);
						temp = Integer.toString(pa);
						str = str + temp + " HIT" + "\n";	
						for (int l = 0; l<k; l++)
						{
						    if(tlba[l]<j)
								tlba[l]++;
							if(l==j)
								tlba[l] = 0;
							mru = j;
						}
						p = 1;
						break;
					}
				}
				if(p == 0)
				{
					for(int h = 0; h<1100; h++)
					{
						if(ptarvpn[h] == R1)
						{
							tempfn = Integer.toBinaryString(ptarpfn[h]);
							temp = tempfn + r2;
							pa = Integer.parseInt(temp,2);
							temp = Integer.toString(pa);
							str = str + temp + " MISS" + "\n";
							if(tm<k-1)
							{
								tlb[tm][0] = ptarvpn[h];
								tlb[tm][1] = ptarpfn[h];
								for (int l = 0; l<tm; l++)
									tlba[l]++;
								tlba[tm] = 0;
								mru = tm;
							}
							else
							{
								tlb[mru][0] = ptarvpn[h];
								tlb[mru][1] = ptarpfn[h];
								tlba[mru] = 0;
							}
							tm++;
							t++;
						}
					}
				}
			}
		}
		else if(args[2].equals("LRU"))
		{
			int lru = 0;
			while(file1.hasNextLine())
			{
				p = 0;
				if(i==1)
				{
					x = Integer.parseInt(file1.nextLine());
					i++;
					continue;
				}
				int n = Integer.parseInt(file1.nextLine());
				String m = Integer.toBinaryString(n);
				String r2 = m.substring(m.length() - x);
				String r1 = m.substring(0, m.length() -x);
				int R1 = Integer.parseInt(r1,2);
				for(int j = 0; j<k; j++)
				{
					if(tlb[j][0] == R1)
					{
						t++;
						th++;
						tempfn = Integer.toBinaryString(tlb[j][1]);
						temp = tempfn + r2;
						pa = Integer.parseInt(temp,2);
						temp = Integer.toString(pa);
						str = str + temp + " HIT" + "\n";	
						for (int l = 0; l<k; l++)
						{
						    if(tlba[l]<tlba[j])
								tlba[l]++;
							if(l==j)
								tlba[l] = 0;
							lru = j;
						}
						p = 1;
						break;
					}
				}
				if(p == 0)
				{
					for(int h = 0; h<1100; h++)
					{
						if(ptarvpn[h] == R1)
						{
							tempfn = Integer.toBinaryString(ptarpfn[h]);
							temp = tempfn + r2;
							pa = Integer.parseInt(temp,2);
							temp = Integer.toString(pa);
							str = str + temp + " MISS" + "\n";
							if(tm<k-1)
							{
								tlb[tm][0] = ptarvpn[h];
								tlb[tm][1] = ptarpfn[h];
								for (int l = 0; l<tm; l++)
									tlba[l]++;
								tlba[tm] = 0;
								lru = tm;
							}
							else
							{
								for( int g = 0; g<k; g++)
										if(tlba[g]==k)
											lru = g;
								tlb[lru][0] = ptarvpn[h];
								tlb[lru][1] = ptarpfn[h];
								tlba[lru] = 0;
								for(int b = 0; b<k; b++)
									if(b!=lru)
										tlba[b]++;
							}
							tm++;
							t++;
						}
					}
				}
			}
		}
		else
		{
			System.out.println("Invalid Command line \nCommand Line should be of format -----> <PageTableFile> <TLBAccessesFile> <LRU/MRU> <no of TLB entries> \nwith \"correct case\"");
			System.exit(0);
		}
		str = "TOTAL_ACCESSES = " + t + "\n" + "TOTAL_MISSES = " + tm + "\n" + "TOTAL_HITS = " + th + "\n" + str;
		FileWriter writer = new FileWriter("20116032_TLBAccessesFile3_PageTableFile3_MRUorLRU_TLBsize.txt");
		writer.write(str);
		writer.close();
	}
} 