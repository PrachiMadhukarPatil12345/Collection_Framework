package Advance_Java_Telusco;
import java.util.Scanner;

public class Jagged_Array
{
	

	public static void main(String[] args)
	{
		//int a;
		System.out.println("----Jagged  Array---");
		
		int fruits[][]=new int[5][];
		fruits[0]=new int[3];     //elements in  each array
		fruits[1]=new int[2];
		fruits[2]=new int[4];
		fruits[3]=new int[5];
		fruits[4]=new int[1];
		
		for (int i=0;i<fruits.length;i++)
		{
				
				//int ar1[]=new int [5];
				
				for (int j=0;j<fruits[i].length;j++) // fruits[i] means i th no cha array i.e 0,1,2 in main arry(size of each individual array in)
				// no of elemnts in each row
				
				{
					System.out.print("Enter Elements");
					Scanner sc=new Scanner(System.in);
					
					fruits[i][j]=sc.nextInt();
				}
				
				
				
		}
			//System.out.println( );

	    
		
		for (int jarray[]: fruits)
		{
			for (int v:jarray)
			{
				
				
				System.out.print(v);
				
			}
			System.out.println();
	   }

}
}