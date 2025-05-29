package Advance_Java_Telusco;

enum  Color
{
	Red , Green , Blue, Pink
}
public class Enum_usingSwitch 
{

	public static void main(String[] args) 
	{ 	Color c= Color.Blue;
		System.out.println( "parent class of enum " + " " +c.getClass().getSuperclass() );
		
	
		switch(c)
		
		{
		case Red:
			System.out.println( " its Red " );
			break;
			
		case Green:
			System.out.println( " its Green " );
			break;
			
		case Blue:
			System.out.println( " its Blue " );
			break;
			
			default:
				System.out.println( " its other color " );
				break;	
			
		}


	}

}
