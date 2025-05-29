package Advance_Java_Telusco;

public class TryWithoutCatch 
{

	public static void main(String[] args) 
	{ int i=18;
	  int j=0;
	  
	 
		try {
			System.out.println(i/j);
			System.out.println(" try block");
		}
		
		finally
		{
			System.out.println(" Finally always executed");
		}

	}

}
