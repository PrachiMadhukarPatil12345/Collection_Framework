package Advance_Java_Telusco;

enum Status 
{ Running, Failed,Pending, Success
	};
	
public class Enum1
{

	public static void main(String[] args)
	{
		Status s= Status.Running;
		Status ss[]= Status.values();
		
		System.out.println( " Enum demo \n " + " " +s);
		System.out.println( " Enum demo \n " + " " +ss[2]);
		System.out.println( " ----------- " );
		System.out.println( " Enum demo \n " + " " +ss.length);
		System.out.println( " ----------- " );
		
		System.out.println( " All Statyus values" + " " );
		
		for(Status i:ss)
		{
			
			//System.out.println(  " "+ i );
			System.out.println(  " "+ i.ordinal() );
		}

	}

}
