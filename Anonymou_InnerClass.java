/**
 * 
 */
package Advance_Java_Telusco;

/**
 * 
 */
class OuterClass1
{
	public void Show()
	{
		System.out.println( "Within the OuterClass ");
	}
	
	/*class InnerClass extends OuterClass1
	 {
		public void Show
		{
			System.out.println( "Within the InnerClass ");
		}
	  }*/
	
  }


public class Anonymou_InnerClass 
{

	public static void main(String[] args)
	{
		OuterClass1 oc=new OuterClass1()
		{
	      public void Show()
				
		              {
	    	            super.Show();
			            System.out.println( "Within the AnonymousInnerClass new Show ");  //  AnonymousInnerClass
		              }
				};
		
		oc.Show();
	}

}
