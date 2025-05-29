/**
 * 
 */
package Advance_Java_Telusco;

/**
 * 
 */

abstract class A
{
	public void Show()
	{
		System.out.println( "Within A Show ");
	}
	
	public abstract void display();
	
}

/*
 * class B extends A { public void display()
 * 
 * { System.out.println( " display from child class "); }
 * 
 * }
 */

 class Abstract_Annonymous_inner
{

      public static void main(String[] args)
	{
    	  A obj=new A()
    	  // Annonymous_inner inner class()
    	{
    		  public void Show()
    			{
    				System.out.println( " new Show ");
    			}
    		  public void display()
    			
    			{
    				System.out.println( " new display ");
    			}
    			
        };
        obj.Show();
        obj.display();
	}

}
