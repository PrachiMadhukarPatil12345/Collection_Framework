/**
 * 
 */
package Advance_Java_Telusco;

/**
 * 
 */

class OuterClass
{
	public void Show()
	{
		System.out.println( "Within the OuterClass ");
	}
	
	class InnerClass
	{
		public void Show1()
		{
			System.out.println( "Within the InnerClass ");
		}
	}
	
    }



public class Nested_Class
{

	public static void main(String[] args)
	{
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass ac= oc.new InnerClass();
		ac.Show1();
	}

}
