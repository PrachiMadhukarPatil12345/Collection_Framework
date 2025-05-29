package Advance_Java_Telusco;

@FunctionalInterface

interface Interface1
{
	 
	 void Show1();
	/*{
		System.out.println( " In A Show ");
	}*/
}



public class Lambada_Expression
{

	public static void main(String[] args)
	{
		Interface1 obj = ()->
		{
			System.out.println( " In new Show ");
		}
		
	;
		obj.Show1();
		
	

	}

}
