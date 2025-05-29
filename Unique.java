package Advance_Java_Telusco;

import java.util.Arrays;

public class Unique
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int arrr[]= {50,40,10,5,5,50,10}; //5,5,10,10,40,50,50,
		Arrays.sort(arrr);
		System.out.println(arrr[0]);
		
		int c=arrr.length-1;
		System.out.println(c);
		
		int sum=arrr[0];
		//int sum=0;
		
		for(int a=1;a<=c;a++)   //7
		{
			if(arrr[a]!=arrr[a-1])
			{
				sum=sum+arrr[a];
				
			}
		}
		System.out.println(sum);
	}

}
