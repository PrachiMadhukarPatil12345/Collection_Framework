package Advance_Java_Telusco;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
		// :- Only difference-> Insertion order is preseved 
		
		LinkedHashSet <Integer>Lset=new LinkedHashSet<>();
		Lset.add(100);
		Lset.add(200);
		Lset.add(300);
		Lset.add(400);
		Lset.add(500);
		System.out.println(" LinkedHashSet1" + Lset);
	}
	
}
