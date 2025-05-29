/**
 * 
 */
package Advance_Java_Telusco;

/**
 * 
 */
@FunctionalInterface
public interface A11
{
	 void Show1();
}
class bb
{
	

public static void main(String[] args)
{ // anmymous class
	A11 obj= ()->
	{
		System.out.println( " In new Show ");
	}

	;	
	obj.Show1();
}
 
}
