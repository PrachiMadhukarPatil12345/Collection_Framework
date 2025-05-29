package Advance_Java_Telusco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class List2 {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(6, 3, 9, 67, 33);

		System.out.println(ls);
		System.out.println(" size is " + ls.size());
		System.out.println(ls.get(3));

		System.out.println("-----------------------");
		try
		{
		 for(int i=ls.size()-1;i>=0;i--) //i=5
		 {
			 System.out.println(ls.get(i)); //i>=1  
		 }
		}
		catch(Exception e)
		{
			 System.out.println(e); 
		}

		ls.forEach(z -> System.out.println("\n " +z));
		
		
		
		/*
		 * for(int j:ls) { System.out.println(j); }
		 * 
		 * Consumer <Integer>con= new Consumer<Integer>() { public void accept(Integer
		 * n) { System.out.println(n); } };
		 * 
		 * ls.forEach(con);
		 */

		
		
		

		// Consumer<Integer>con= (n -> System.out.println(n));

		// ls.forEach(n -> System.out.println(n));
	}

}
