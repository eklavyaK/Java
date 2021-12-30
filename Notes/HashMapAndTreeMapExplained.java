import java.io.PrintWriter;    
import java.io.BufferedReader;  
import java.io.InputStreamReader;  
import java.io.IOException;
import java.util.*;                       //Hashmap is in util package and can be called as import java.util.HashMap;
import java.lang.String;

/*Java HashMap class implements the Map interface which allows us to store key and value pair, 
where keys should be unique. If you try to insert the duplicate key, it will replace the 
element of the corresponding key. Values of two Keys can be duplicate. It is easy to perform operations using the key index like 
updation, deletion, etc. HashMap class is found in the java.util package.*/

public class HashMapAndTreeMapExplained
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader ob = new InputStreamReader(System.in);    
        BufferedReader br = new BufferedReader(ob);
		PrintWriter out = new PrintWriter(System.out);  
		HashMap<Integer,String> map = new HashMap<Integer,String>();      //Creating HashMap 
		HashMap<String,Integer> integerone = new HashMap<String,Integer>();      
		//where Integer entries are the "Keys" to String entries "values"
		for(int i = 0; i<10; i++)
		{
			map.put((i+1),br.readLine()); //put() method is used to make an entry into Hashmap
		}
		/*	Inputs:
		
			hellow
			how
			home
			has
			hat
			however
			hit
			has
			hell
			hut    */
			
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=hut}
		
		out.println(map.get(3));        //get() method is used to get the value of the key provided - prints: home
		out.println(map.get(45));		//prints: null         because key doesn't exist
		out.println(map.get("hellow")); //prints: null         because key doesn't exist
		
		integerone.put("banana",1);
		integerone.put("mango",5);
		integerone.put("orange",9);
		integerone.put("grapes",0);
		integerone.put("lichi",3);
		
		out.println(integerone.get("mango"));     //prints: 5
		out.println(integerone.get("fruits"));    //if value is integer type them also it prints: null          so for both integer and string it prints null for key doesn't exist
		
		//to print the HashMap in the way we want we can use Entry interface and set() function
		for(Map.Entry m : map.entrySet())    
			out.println(m.getKey()+" "+m.getValue()); 
		
		/*	output:
		
			1 hellow
			2 how
			3 home
			4 has
			5 hat
			6 however
			7 hit
			8 has
			9 hell
			10 hut 
		*/
		
		//HashMap can also take array as one of the lists
		HashMap<Integer,int[]> map = new HashMap<Integer,int[]>();
		map.put(1,new int[]{2,5});
		out.println(map.get(1)[0]); //prints: 2
		
		map.putIfAbsent(9,"Hello");    //Key 9 is already in the map so it isn't added
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how}
		map.putIfAbsent(11,"Hello");   //Key 11 is not in the map so it is added
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how, 11=Hello}
		
		out.println(map.get(3));    //get() function is used to get the value of the 3rd key
		
		map.remove(19);             //removes nothing because 19 isn't a key
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how, 11=Hello}
		map.remove(11);             //removes key 11 with its value
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how}
		map.remove("hellow");      //removal doesn't happen through values
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how}
		map.remove(10,"hellow");      //removal doesn't happen because hellow is present in key = 1
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how}
		map.remove(10,"how");      //removal happens because how is present in key = 10
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell}
		
		map.put(10,"how");
		
		map.replace(1,"hello");   //replaces key 1 with hello
		out.println(map);
		//prints: {1=hello, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how}
		map.replace(11, "hello"); //nothing happens
		out.println(map);
		//prints: {1=hello, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how}
		map.replace(1,"hello","hellow");   //replaces with second value.
		out.println(map);
		//prints: {1=hellow, 2=how, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how}
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		
		map2.put(2,"I am ok");
		map2.put(11, "hurdle");
		map2.put(1,"How are you?");
		
		map.putAll(map2); //it incorporates the map2 to map, in case of key conflict between map
		//and map2, the values of map2 will replace that of map
		out.println(map);
		//prints: {1=How are you?, 2=I am ok, 3=home, 4=has, 5=hat, 6=however, 7=hit, 8=has, 9=hell, 10=how, 11=hurdle}
		out.println(map2);
		//prints: {1=How are you?, 2=I am ok, 11=hurdle}
		
		//Notice above that keys are always printed in ascending order
		
		map.replaceAll((k,v) -> "END");      //Replaces all the values with END
		out.println(map);
		//prints: {1=END, 2=END, 3=END, 4=END, 5=END, 6=END, 7=END, 8=END, 9=END, 10=END, 11=END}
		
		//HashMap Sotring
		
		/*The TreeMap follows Red Black Tree based implementation. The map is sorted according to the natural ordering of its keys. */
		
		HashMap<Integer,String> inthm = new HashMap<Integer,String>();
		HashMap<String,Integer> stringhm = new HashMap<String,Integer>();
		TreeMap<Integer,String> inttm = new TreeMap<Integer,String>();
		TreeMap<String,Integer> stringtm = new TreeMap<String,Integer>();
		
		inthm.put(34,"the");
		inthm.put(45,"man");
		inthm.put(12,"who");
		inthm.put(5,"has");
		inthm.put(100,"done");
		
		for(Map.Entry m : inthm.entrySet())    
			out.println(m.getKey()+" "+m.getValue());
		out.println();
		
		/*Output:
		
		34 the
		100 done
		5 has                            //there is no order in printed output
		12 who
		45 man
		
		*/
		
		stringhm.put("the", 34);
		stringhm.put("man", 45);
		stringhm.put("who", 12);
		stringhm.put("has", 5);
		stringhm.put("done", 100);
		
		for(Map.Entry m : stringhm.entrySet())    
			out.println(m.getKey()+" "+m.getValue());
		out.println();
		
		/*Output:
		
		the 34
		man 45
		has 5                           //there is no order in printed output
		done 100
		who 12
		
		*/
		
		inttm.putAll(inthm);
		
		for(Map.Entry m : inttm.entrySet())    
			out.println(m.getKey()+" "+m.getValue());
		out.println();
		
		/*Output:
		
		5 has
		12 who     
		34 the                          //the output has been ordered in natural order of keys
		45 man
		100 done
		
		*/
		
		stringtm.putAll(stringhm);
		
		for(Map.Entry m : stringtm.entrySet())    
			out.println(m.getKey()+" "+m.getValue());
		out.println();
		
		/*Output:
		
		done 100
		has 5
		man 45                          //the output has been ordered in natural order of keys
		the 34
		who 12
		
		*/
		
		out.close();
	} 
}
