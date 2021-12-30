import java.io.PrintWriter;    //PrintWriter class is in io package
import java.io.BufferedReader;  //BufferedReader class in in io package
import java.io.InputStreamReader;  //InputStreamReader is in io package
import java.io.IOException;
import java.lang.Object;       //Object class is in lang package
import java.util.ArrayList;     //ArrayList package is in util package
import java.util.Collections;   //Collectons is the parent class of collections type like arraylist,
//list, array. It is available in util package
import java.lang.String;
public class InputStreamReader_BufferedReader_PrintWriter_IOException
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader ob = new InputStreamReader(System.in);    //System.in indicates the input from user. InputStreamReader reads the input as stream of inputs
		//now this object is passed to the bufferedreader which reads the input.
        BufferedReader br = new BufferedReader(ob);   
		//we can also directly write it as:  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ouuut = new PrintWriter(System.out);             //Here System.out is used to print the output
		String k[] = br.readLine().split(" ");         //bufferedreader reads every input as string, afterwards they are parsed to the their respective data types
		//as required
		String s = br.readLine();
		int a = Integer.parseInt(k[0]);
		double b = Double.parseDouble(k[1]);
		ouuut.print(a+" ");          //this is used to print the output on the console without placing the cursor on the next Line
		ouuut.println(b);            //this is used to print the output on the console and places the cursor on the next Line
		ouuut.println(s);
		ouuut.flush();           //this is used to push everything from the stored in buffer to console. Everything which println or print write
		//is not printed immediately, it is stored in the buffer and is printed only after it PrintWriter object is closed. But we can use flush function to print 
		//everything there in the buffer to the console thereby leaving the buffer empty. If we don't write this statement here and we don't close the PrintWriter
		//object in the program, nothing will be printed. But if we write it here and don't close the Printwriter object then next string s won't be printed
		ouuut.println(s);
		ouuut.close();
		ouuut.println(s);          //this statement is a waste as object is already closed.
		ouuut.close();
	} 
}
/*Input:					output:

234 090.2					234 90.2
asdflk;						asdflk;
							asdflk;