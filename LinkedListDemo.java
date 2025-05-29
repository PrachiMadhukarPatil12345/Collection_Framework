package Advance_Java_Telusco;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo
{

	public static void main(String[] args)
	{
		System.out.println(" ------by defult linked list will follow doubly linked list dt stucture\n"
		+ "  refer L. Lists whn u have to perform more no of insetion & deletion oetion");
		
//		LinkedList <Integer>l=new LinkedList<>(); //llist is class
//		LinkedList <String>l=new LinkedList<>(); //both can store heterogenous data
		
		LinkedList l=new LinkedList(); // store heterogenous data
        l.add(100);
        l.add("welcome");
        l.add(80.78);
        l.add('Y');
        l.add(false);
        l.add(null);
        
        System.out.println(l.getClass());
        System.out.println(l);
        System.out.println(l.size());
        l.remove(3); // index
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        
        //  l.remove('Y'); // not works
        
        // Adding element in the middle of linked list
        l.add(3,"java");
        System.out.println("After removing" +l);
        
        //retrieving value
        System.out.println(l.get(3));
        
        // change  /relace value
        l.set(5,true);
        
        // contains ()
        System.out.println(l.contains('Y'));
        
        //l.isEmpty
       boolean b=l.isEmpty();
       
       // Reding element from L.list using for loop
       System.out.println("----------------------------");
    		   
       int s=l.size();
       for(int o=s-1;o>=0;o--) //Reverse oder
    	   
       {
    	   System.out.println(l.get(o));
       }
       
       System.out.println("-----------using forEach----------");
        // Reding element from L.list using for each loop
       l.forEach(h -> System.out.println (h));
       
       System.out.println("-----------using Advance for----------");
       for(Object u:l)
       {
    	   System.out.print(u);
       }
       System.out.println("-----------using Iteato method----------");
       Iterator it= l.iterator();
       while(it.hasNext())
       {
    	   System.out.print(it.next()); // rint existing element & moves on next elemeent 
       }
	}

}
