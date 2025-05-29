package Advance_Java_Telusco;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args)
	{
		HashSet <Integer>evenno=new HashSet<Integer>();
		evenno.add(2);
		evenno.add(4);
		evenno.add(6);
		evenno.add(8);
		evenno.add(8);
		evenno.add(8);
		
		System.out.println(" evenno Hashsey" + evenno);
		
		HashSet <Integer>no=new HashSet<Integer>();
		no.addAll(evenno);
		no.add(500);
		
		no.removeAll(evenno);
		
		System.out.println( "\n "+ "New No" + no);
		
	}

}
