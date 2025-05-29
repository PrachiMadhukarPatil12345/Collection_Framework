package Advance_Java_Telusco;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{

	public static void main(String[] args)
	{
		// HashSet hs=new HashSet(); // default / initial size 16 elements ,load factor =0.75, when 75% of elements 
		// are filld then it will create new HashSet & all existing elemnts will b moved to new Hashset.
		 //HashSet hs=new HashSet(100);
		//HashSet h1=new HashSet(100,95);
		//HashSet <Integer>h2=new HahSet<Integer>();
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("wel-come");
		hs.add(100.95);
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println("  ");
		
		//remove
		hs.remove(100.95);
		System.out.print(hs.contains(100.95));
		System.out.println("  ");
		
		// reading element using advance for loop
		for(Object o:hs)
		{
			System.out.println(o);
		}
		// reading element using iterator mehod
		System.out.println("  ");
		
		Iterator it; it=hs.iterator();
		{ while(it.hasNext())
		{
			System.out.println(it.next());     // rint existing element & moves on next elemeent
	    }
	}

}
}
