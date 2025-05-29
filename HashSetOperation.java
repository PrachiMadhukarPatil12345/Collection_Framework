package Advance_Java_Telusco;

import java.util.HashSet;

public class HashSetOperation
{

	public static void main(String[] args)
	{
		// Union ,Itersection , diffece
		HashSet <Integer>set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println(" Set1" + set1);
		
		HashSet <Integer>set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		set2.add(10);
		System.out.println("Set2" + set2);
		
		//union 
		//set2.addAll(set1);
		//System.out.println(" Union" + set2);
		
		//Intersection, common elements
		//set2.retainAll(set1);
		//System.out.println("Intersection" + set2);
		
		// Difference
		/*
		 * set2.removeAll(set1); System.out.println(" Differnc" + set2);
		 * 
		 */
		set2.containsAll(set1);
		{
			System.out.println("Subset" + set2);
		}
	}

}
