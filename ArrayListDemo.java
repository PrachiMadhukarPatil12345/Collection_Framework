package Advance_Java_Telusco;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
//		 ArrayList <Integer>al= new ArraList<>();
//		 ArrayList <String >al= new ArrayList<>();
		//ArrayList al3= (ArrayList)Arrays.asList(8,9,5,5,1,5);
		 //System.out.print(al3);
		 
	  ArrayList al= new ArrayList();
	  al.add(10);
	  al.add("Welcome");
	  al.add(10.57);
	  al.add('A');
	  al.add(true);
	  al.add("Prachi");
	  
	  System.out.print(al.getClass());
	  System.out.println(al);
	 // System.out.println(" Returns the number of elements in this list" + " " +al.size());
	 // System.out.println(al.remove(2));  // index
	 // System.out.println(al.remove("Prachi"));
	  System.out.println("number of elements in this list after removal" + " " + al +" " + al.size());
	  System.out.println(           );
	  
	  al.add(2,"new_Elment");
	  al.add("Python");
	  
	  //retrievee secific elment
	  
	  System.out.println(al.get(4));
	  System.out.println("number of elements in this list after removal" +" \n" + " " + al +" " + al.size());
	  
	  // change element replace
	  System.out.println(al.set(4,false));
	  
	  // search -  Returns true if this list contains the specified element. 
	  System.out.println(al.contains(false));
	  
	  ArrayList newArraylist =new ArrayList();
	  newArraylist.addAll(al);
	  
	  System.out.println("----- New duplicate list -----");
	  System.out.println(newArraylist);
	  
	  System.out.println(newArraylist.removeAll( al));
	  
	  System.out.println("----- Printing -----");
	  
	  for(int x=0;x<al.size();x++)
	  {
		  System.out.println(al.get(x)); 
	  }
	  
	  
	  System.out.println("----- ");
	  
	  
	  for(Object o:al) // we have to store tys of data in the al so dt te should be object only
	  {
		  System.out.println(o); 
	  }
	  
	  // Iterator method
	  System.out.println("-----------------Reding element using iterator--  ");
	  Iterator it=al.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next()); 
	  }
	  
	  
	  
	  System.out.println("----- -----------Sorting ------------");
	  ArrayList al2 =new ArrayList();
	     al2.add("x");
	     al2.add("y");
	     al2.add("z");
	     al2.add("C");
	     al2.add("B");
	     al2.add("A");
	     //System.out.println(al2.indexOf(2));
	     System.out.println(" All Elemnts in Array" +" "+ al2);
	     Collections.sort(al2);
	     System.out.println("After Sorting" + " " +al2);
	     Collections.sort(al2,Collections.reverseOrder());
	     System.out.println("After Revesing" + " " +al2);
	     
	     System.out.println("----- -----------Shuffling -----");
	     Collections.shuffle(al2);
	     System.out.println("After Shuffling" + " " +al2);
}
}