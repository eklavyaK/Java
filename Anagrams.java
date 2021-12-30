import java.util.*;
public class Anagrams
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine(), s2 = sc.nextLine(),str="Eklavya";
		if(s1.length()==s2.length())
		{
			str="";
			for(int i=0; i<s1.length();i++)
			{
				if((int)s1.charAt(i)<=90)
				{
					for(int j=0; j<s2.length(); j++)
					{
						if((int)s2.charAt(j)<=90)
						{
							if(s2.charAt(j)==s1.charAt(i))
							{
								for(int l=0; l<s2.length(); l++)
								{
									if(l!=j)
									str = str + s2.charAt(l);
								}
								s2=str;
								str="";
								break;
							}
						}
						if((int)s2.charAt(j)>90)
						{
							int p = (int)s2.charAt(j)-32;
							if((char)p==s1.charAt(i))
							{
								for(int l=0; l<s2.length(); l++)
								{
									if(l!=j)
									str = str + s2.charAt(l);
								}
								s2=str;
								str="";
								break;
							}
						}
					}
				}
				if((int)s1.charAt(i)>90)
				{
					for(int m=0; m<s2.length(); m++)
					{
						if((int)s2.charAt(m)>90)
						{
							if(s2.charAt(m)==s1.charAt(i))
							{
								for(int h=0; h<s2.length(); h++)
								{
									if(h!=m)
									str = str + s2.charAt(h);
								}
								s2=str;
								str="";
								break;
							}
						}
						if((int)s2.charAt(m)<=90)
						{
							int p = (int)s2.charAt(m)+32;
							if((char)p==s1.charAt(i))
							{
								for(int h=0; h<s2.length(); h++)
								{
									if(h!=m)
									str = str + s2.charAt(h);
								}
								s2=str;
								str="";
								break;
							}
						}
					}
				}
			}
			if(s2.equals(""))
			System.out.println("Anagrams");
			else
			System.out.println("Not Anagrams");
		}
		else
		System.out.println("Not Anagrams");
	}
}

