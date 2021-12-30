import java.io.IOException;
import java.lang.StringBuilder;         //StringBuilder Class is available in lang package, like all other string classes
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

//StringBuilder is faster than StringBuffer because it's not synchronized

public class StringBuilderClass
{
	/*Java StringBuilder class is used to create mutable (modifiable) String objects. 
	The StringBuilder class in Java is the same as String class except it is mutable i.e. it can be changed. We cannot apply general string functions(like concat()) on 
	StringBuilder object but there many same functions as in StringBuilder class as general string functions for ex: length(), charAt(), substring(). These are 
	also functions in StringBuilder class and perform same operations*/
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		/* Constructors of StringBuilder Class
		
		StringBuilder()	It creates an empty String buffer with the initial capacity of 16.
		
		StringBuilder(String str)	It creates a String buffer with the specified string.
		
		StringBuilder(int capacity)	It creates an empty String buffer with the specified capacity as length.
		
		*/
		
		StringBuilder s = new StringBuilder(br.readLine());           //the object of class StringBuilder is created named s
		//Input:  The Statesman
		
		s.append(" is a newspaper. ");            //adds the given to the end of same
		s.append(234.23);                  //append() method is overloaded to accept various types of input
		s.append(" ");                   
		s.append(true);                    //we can also append boolean because append method is overloaded
		out.println(s);             //prints: The Statesman is a newspaper. 234.23 true
		
		String s1 = s+ " Hellow";
		out.println(s1.equals(s));     //returns false
		out.println(s.substring(5,10));  //prints: tates
		out.println(s.charAt(20));   // prints: e 
		
		s.insert(3, " brilliant");  //insert method is used to insert a string in the StringBuilder object where the first character of string to be inserted is placed on 
		//the position provided in the bracket
		out.println(s);    //prints: The brilliant Statesman is a newspaper. 234.23 true
		s.insert(3," ");
		s.insert(4, true);    //Like append() method, the insert() method is also overloaded to insert values of different types
		out.println(s);        //pritns: The true brilliant Statesman is a newspaper. 234.23 true
		
		s.replace(3,19," "); //replace() method replaces the chunk of string from index starting 3 to 18(just before 19) with the given string in bracket
		out.println(s);      //prints: The Statesman is a newspaper. 234.23 true
		
		s.delete(38,s.length());  //delete() method deletes the chunk of string from index starting from 38 to just before the given index
		out.println(s);           //prints: The Statesman is a newspaper. 234.23 t
		s.replace(29,s.length(), "");     //we can also use replace() method in this way to delete chunk of string
		out.println(s);           //prints: The Statesman is a newspaper.
		
		out.println(s.reverse());  //prints: .repapswen a si namsetatS ehT           reverse() method is used to reverse the string 
		s.reverse();
		
		/*The capacity() method of the StringBuilder class returns the current capacity of the buffer. 
		The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases 
		the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34 , it is the way 
		of memory management. */
		
		out.println(s.capacity());  //prints: 60      this method is not much useful to us as of now
		
		out.println(s.lastIndexOf("newspaper"));  //this method is used to return the index of first character of given string at its last occurrence - prints: 19
		out.println(s.lastIndexOf("Eklavya"));   //if given is not present then returns: -1           Note: you have to give string type only so give the characters in double quotes
		
		out.println(s.indexOf("e"));             //indexOf() method returns the index of first character of the given string at its first occurance - prints: 2
		//returns -1 if not present
		
		out.close();                   
	}
}