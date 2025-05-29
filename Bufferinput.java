package Advance_Java_Telusco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferinput
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.println(" Enter no");
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader bf =new BufferedReader(is);
		int i= Integer.parseInt(bf.readLine());
		
		System.out.println(" Enter no is :" + " " + i);
		//bf.getClass()
		
		try {
			
		}
		
		finally
		{
			System.out.println(" Finally always executed");
			bf.close();
		}
		

		
	}

}
