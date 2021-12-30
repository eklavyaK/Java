import java.io.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.String;
import java.util.Arrays;
public class ArrayListExplained
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Integer> in = new ArrayList<>();
		ArrayList<String> st = new ArrayList<>();
		ArrayList<String> str = new ArrayList<>();
		in.add(1);     //add() function adds a new element to the arraylist at the end
		in.add(3);
		in.add(8);
		in.add(2);
		in.add(3);
		out.println(in);           //prints: [1, 3, 8, 2, 3]
		st.add("just");
		st.add("what");
		st.add("me");
		out.println(st);             //prints: [just, what, me]
		str.add("Hello");
		str.add("Hi");
		str.add("Hey");
		out.println(str);                      //prints: [Hello, Hi, Hey]
		st.addAll(str);                        //adds str to st 
		//st.addAll(st);					   	   //st can also be added to itself
		//out.println(st);                       //prints: [just, what, me, Hello, Hi, Hey, just, what, me, Hello, Hi, Hey] if not commented
		
		//you can also add(insert) elements to a specific position in arraylist, elements beyond that index are shifted right by 1 index
		//for ex:
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(23);
		a.add(900);
		a.add(32);
		a.add(8);
		a.add(89);
		out.println(a);                         //prints: [2, 23, 900, 32, 8, 89]
		a.add(0,234);
		out.println(a);                         //prints: [234, 2, 23, 900, 32, 8, 89]
		a.add(2,987);
		out.println(a);                         //prints: [234, 2, 987, 23, 900, 32, 8, 89]
		
		
		out.println(st);                        //st changed after the addition of str - prints: [just, what, me, Hello, Hi, Hey]
		out.println(str);						//str remains the same - prints: [Hello, Hi, Hey]
		out.println(st.get(4));					//obtains the value at index 4 - prints: Hi
		in.remove(1);							//removes 3 which is at index 1. 
		//since it is dynamic array list all the elements beyond index 1 shift their
		//position by 1 towards left.
		out.println(in);						//prints: [1, 8, 2, 3]        notice the shifting, originally it was: [1, 3, 8, 2, 3]
		out.println(in.get(1));                 //now we get 8 at position 1 --> prints: 8
		in.set(1,3);
		out.println(in);                        //prints: [1, 3, 2, 3]
		//in.set(3,8);                          //throws exception IndexOutOfBoundsException
		//because 3 is out of bound, this proves that we cannot add elements to arraylist
        //using set function
		in.add(3);
		in.add(4);
		out.println(in);                       //prints: [1, 3, 2, 3, 3, 4]
		//in.removeAll(3);
		//in.removeAll([3, 4]);                //throws error
		int max = Collections.max(in);         //this method is used to find the maximum element of a integer arraylist
		out.println(max);                      //prints: 4
		String m = Collections.max(st);        //this method is also used to find the highest lexicographic string
		out.println(m);                        //prints: what
		
		out.println(st);
		str.add("come");
		out.println(str);					   //prints: [Hello, Hi, Hey, come]
		st.removeAll(str);                     //removes all the elements from st which is
		//common in both st and str.
		out.println(st);                       //prints: [just, what, me]
		st.remove(str);
		out.println(st);                       //It won't throw exception if there is no common, prints: [just, what, me]
		str.clear();							//it is used to remove everything from the list
		out.println(str);                       //pritns: []
		str.add("Hello");
		str.add("Hi");
		str.add("Hey");
		str.add("come");
		out.println(str.isEmpty());             //returns boolean value of whether list is, prints: false
		//empty or not
		out.println(str.contains("come"));		//retruns boolean value of whether "come", prints: true
		//is present or not in the arraylist
		out.println(str.contains("hellow"));    //prints: false
		out.println(in.size());					//returns the size of the arraylist, prints: 6
		out.println();
		Object[] a = in.toArray();				//converts the arraylist to array
		for(int i = 0; i<in.size(); i++)
			out.print(a[i]+ " ");               //prints: 1 3 2 3 3 4
		out.println();
		
		//Sorting of ArrayList 
		Collections.sort(st);					//sort() method of Collections class of util package sorts the string Arraylist in natural order
		out.println(st);                        //prints: [just, me, what]
		Collections.sort(st,Collections.reverseOrder()); //reverseOrder() method of collections class sorts in descending lexicographic order
		out.println(st);                        //prints: [what, me, just]
		Collections.sort(st,Comparator.naturalOrder());  //naturalOrder() method of comparator class sorts in ascending lexicographic order
		out.println(st);						//prints: [just, me, what]
		Collections.sort(st,Comparator.reverseOrder());  ////reverseOrder() method of comparator class sorts in descending lexicographic order
		out.println(st);                        //prints: [what, me, just]
		Collections.sort(st);
		Collections.sort(in);						//just like strings integer arraylist can also sorted
		out.println(in);                        //prints: [1, 2, 3, 3, 3, 4]
		Collections.sort(in,Collections.reverseOrder());
		out.println(in);                        //prints: [4, 3, 3, 3, 2, 1]
		Collections.sort(in,Comparator.naturalOrder());
		out.println(in);                        //prints: [1, 2, 3, 3, 3, 4]
		
		//Conditional sorting
		Collections.sort(str, (x,y)->{ return x.length() - y.length();}); //like arrays we can also do conditional sorting in arraylist, only difference is that we need 
		//Collections class of util package instead Arrays class
		out.println(str);                       //prints: [Hi, Hey, come, Hello]
		
		out.close();
	}
}