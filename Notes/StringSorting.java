import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class testfile2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s[] = new String[sc.nextInt()];
		String f = sc.nextLine();
		for(int i = 0; i<s.length; i++)
			s[i] = sc.nextLine();
		
		/* input
		10
		bird
		reptile
		mammal
		microorganisms
		plant
		fish
		bacteria
		insect
		nonliving
		endoflist
		*/
		System.out.println(s[0].compareTo(s[1]));
		//compareTo() method compares two string lexicographically and if strings differ at a particular index i then it returns (int)s[0].charAt(i) - s[1].charAt(i)
		//so it returns 0 if both strings are same
		
		System.out.println(Arrays.toString(s)); //prints: [bird, reptile, mammal, microorganisms, plant, fish, bacteria, insect, nonliving, endoflist]
		
		
		String clone0[] = s.clone();
		Arrays.sort(clone0);                    //Arrays.sort() method is used to sort a string in lexicographic order
		System.out.println(Arrays.toString(clone0)); //prints: [bacteria, bird, endoflist, fish, insect, mammal, microorganisms, nonliving, plant, reptile]
		
		
		String clone1[] = s.clone();
		String clone2[] = s.clone();
		Arrays.sort(clone1,Collections.reverseOrder());  //reverseOrder() function of Collections class of util package gives the string array in descending lexicographic order
		Arrays.sort(clone2,Comparator.reverseOrder());   //reverseOrder() function of Comparator class of util package also gives the same result
		System.out.println(Arrays.toString(clone1));   //prints: [reptile, plant, nonliving, microorganisms, mammal, insect, fish, endoflist, bird, bacteria]
		System.out.println(Arrays.toString(clone2));   //prints: [reptile, plant, nonliving, microorganisms, mammal, insect, fish, endoflist, bird, bacteria]
		
		
		String clone3[] = s.clone();
		Arrays.sort(clone3,Comparator.naturalOrder());   //natralOrder() function of Comparator class of util package also gives ascending order result
		System.out.println(Arrays.toString(clone3));     //prints: [bacteria, bird, endoflist, fish, insect, mammal, microorganisms, nonliving, plant, reptile]
		
		
		//conditional sorting
		//Arrays.sort() method also performs conditional sorting based on the information provided by used
		//It compares two strings based on the how we want it to compare them, we give two strings as (a,b)
		//If result of contidion is 0, then strings are considered equal if it is negative then it b is considered greater, if it is positive then a is greater
		//Let's perform few conditional sorting
		//Let's compare two string based on their length
		String clone[] = s.clone();
		Arrays.sort(clone, (a,b)->{return a.length() - b.length();});   //here in this method two strings passed to a,b then operations are performed and an integer number is
		//returned which decides the way the strings will be sorted depending the positivity and negativity of returned value. Here they are sorted according to their length
		System.out.println(Arrays.toString(clone));   //prints:  [bird, fish, plant, mammal, insect, reptile, bacteria, nonliving, endoflist, microorganisms]
		
		
		//we can also perform the above operation using comparator
		String clone5[] = s.clone();
		Arrays.sort(clone5, new Comparator<String>(){
												@Override
												public int compare(String s1,String s2)
												{
													return s1.length() - s2.length();         //condition on which basis the strings should be compared
												}
											  });       //here in this method two strings passed to a,b then operations are performed and an integer number is
		//returned which decides the way the strings will be sorted depending the positivity and negativity of returned value. Here they are sorted according to their length
		System.out.println(Arrays.toString(clone5)); //prints:  [bird, fish, plant, mammal, insect, reptile, bacteria, nonliving, endoflist, microorganisms]
	}
}