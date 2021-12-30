import java.io.PrintWriter;    
import java.io.BufferedReader;  
import java.io.InputStreamReader;  
import java.io.IOException;
import java.util.StringTokenizer;  //StringTokenizer is in util package
import java.lang.String;

// The java.util.StringTokenizer class allows you to break a String into tokens. It is simple way to break a String.



/* Different constructors in StringTokenizer class

1. StringTokenizer(String str): default delimiters like newline, space, tab, carriage return, and form feed are used too separate the tokens

2. StringTokenizer(String str, String delim):  delim is a set of delimiters that are used to tokenize the given string.

3. StringTokenizer(String str, String delim, boolean flag): The first two parameters have the same meaning wherein The flag 
serves the following purpose.

(i) If the flag is false, delimiter characters serve to separate tokens

Example:

Input : if string --> "hello geeks" and Delimiter is " ", then 
Output:  tokens are "hello" and "geeks".

(ii) If the flag is true, delimiter characters are considered to be tokens.

Example:

Input : String --> is "hello geeks"and Delimiter is " ", then 
Output: Tokens --> "hello", " " and "geeks".
*/

public class StringTokenizerExplained
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader ob = new InputStreamReader(System.in);    
        BufferedReader br = new BufferedReader(ob);
		PrintWriter out = new PrintWriter(System.out);  
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " always");                //Here every character is used as a single token which can be seen in the printed output
		StringTokenizer st3 = new StringTokenizer(br.readLine(), " a", true);
		StringTokenizer st4 = new StringTokenizer(br.readLine(), " a", false);              //if there is no boolean provided like in st2 the default value is false
		StringTokenizer st5 = new StringTokenizer(br.readLine(), " ");
		/* input
		
		When a artist at aisle he always arts all
		When a artist at aisle he always arts all
		When a artist at aisle he always arts all
		When a artist at aisle he always arts all
		When a artist at aisle he always arts all
		
		*/
		
		/* Methods of StringTokenizerClass
		
			Method	                    Action Performed
			
			countTokens()	            Returns the total number of tokens present from the present position to the end
			hasMoreTokenss()	        Tests if tokens are present for the StringTokenizer’s string without shifting the cursor
			nextElement()	            Returns an Object rather than String, and shifts the cursor to next token
			hasMoreElements()	        Returns the same value as hasMoreTokens doesn't shift the cursor
			nextToken()	                Returns the next token from the given StringTokenizer, and shifts the cursor to next token
		*/
		
		out.println(st5.countTokens());          //prints 9 because cursor is at start, so it prints the actual value of no of tokens
		
		String str = st5.nextToken();            //Tokens are strings and we can apply string functions to them. Here nextToken() shifts the cursor to next token
		out.println(str.equals("When"));		 //prints: true 
		out.println(st5.nextToken().equals("a"));   //prints: true
		
		out.println(st5.nextToken());         //prints: artist
		out.println(st5.nextToken());         //prints: at
		out.println(st5.nextToken());		  //prints: aisle
		
		out.println(st5.countTokens());		  //prints: 4 because it counts from the present position of the cursor to the end
		
		out.println(str);                     //prints: when
		
		out.println(st1.countTokens());           //counts the number of tokens from the point where cursor is present it doesn't change the position of the cursor then print
		
		while(st1.hasMoreTokens())
			out.print(st1.nextToken()+" ");       //prints: When a artist at aisle he always arts all
		out.println();
		while(st1.hasMoreTokens())
			out.print(st1.nextToken()+" ");       //prints nothing because cursor is already crossed the last token the while becomes fase at first
		out.println();
		
		while(st2.hasMoreElements())
			out.print(st2.nextElement()+" ");     //prints: When rti t t i e he rt         //string is separated into tokens whenever any delimiter of " always" has been found
		out.println();
		
		while(st3.hasMoreTokens())
			out.print(st3.nextToken()+" ");       //prints: When   a   a rtist   a t   a isle   he   a lw a ys   a rts   a ll        //here delimiters are also included as tokens
		out.println();
		
		while(st4.hasMoreTokens())
			out.print(st4.nextToken()+" ");       //prints: When rtist t isle he lw ys rts ll             //here delimiters are not included as tokens
		out.println();
		
		while(st1.hasMoreTokens())
			out.print(st1.nextToken()+" ");       //prints nothing because cursor is already crossed the last token the while becomes fase at first
		out.println();
		
		out.println(st1.countTokens());           //Here it gives the value as 0 because cursor is beyond last token
		
		out.close();
	} 
}
