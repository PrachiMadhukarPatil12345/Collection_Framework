package Advance_Java_Telusco;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1
{
	
	public static void main(String[] args)
	{
		List<Integer>nums =Arrays.asList(4,5,7,3,2,6);
		Stream<Integer> s11=nums.stream();
		Stream<Integer> s12=s11.sorted();
		s12.forEach(t-> System.out.print(t));
		
		/*
		 * Stream<Integer> s1=nums.stream(); 
		 * Stream<Integer>s2=s1.filter(n-> n%2==1 );
		 * Stream<Integer>s3=s2.map(n-> n*5);
		 * int result=s3.reduce(0,(c,e)-> c+e);
		 */
		
		int result=nums.stream()
				     .filter(n-> n%2==0)
				     .map(n -> n*2)
				     .reduce(0, (c,e) -> (c+e));
				     System.out.println(result);
		
		//System.out.println(nums);
		//s1.forEach(d -> System.out.print(d));
		//s2.forEach(d -> System.out.print(d));
		System.out.println(result);
	}

}
