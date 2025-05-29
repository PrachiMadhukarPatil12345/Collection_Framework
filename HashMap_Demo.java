package Advance_Java_Telusco;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo
{
	public static void main(String[] args)
	{
		HashMap m=new HashMap();
		//HashMap<Integer,String> hm=new HashMap(); //  Integr-> Key, String-> Values.
		m.put(101, "John");
		m.put(102, "nair");
		m.put(103, "raj");
		m.put(104, "siya");
		m.put(105, "giya");
		m.put(105, "riya"); //overrides key , duplicate key not allowed
		m.put(106, "riya"); // duplicate value allowed
		
		System.out.println(m);
		System.out.println(m.get(105));
		System.out.println(m.remove(101)); //remove pair from hashmap
		System.out.println(m.containsKey(101));
		System.out.println(m.containsKey(106));// Returns true if this map contains a mapping for thespecified key
		System.out.println(m.isEmpty()); // Returns true if this map contains no key-value mappings
		System.out.println(m.keySet()); // Returns a Set view of the keys contained in this map.
		System.out.println(m.values());
		//System.out.println(m.entrySet());// Returns all the entries as a Set.
		
		System.out.println("  ");
		/*
		 * for(Object i: m.keySet()) { System.out.println("Key" + i + "        " +
		 * "Values"+ "    " + m.get(i)); }
		 */
		// Entry Methods
		
		/*
		 * for(Map.Entry entry:m.entrySet()) { System.out.println(entry.getKey() + " " +
		 * entry.getValue()); }
		 */
	}
}
