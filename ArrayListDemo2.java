package Advance_Java_Telusco;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2
{
   
	public static void main(String[] args)
	{
		//String []arr=new String[8];
		String []arr= {"Ant","Jirraf","Elphant","Sqarrel"};
		int length = arr.length;
		
		
		System.out.println(" --------copying array elements to arraylist------- ");
		ArrayList al=new ArrayList(Arrays.asList(arr));
		
		
		
		System.out.println(al);
		
		al.forEach(z -> System.out.println("\n " +z)); // above both r sam stmts 
	}

	
	
}
