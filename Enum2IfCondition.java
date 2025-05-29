package Advance_Java_Telusco;


enum seasons{
	summer,Winter , Mansoon
}
public class Enum2IfCondition
{

	public static void main(String[] args)
	{
		seasons s1= seasons.Winter;
		if (s1==seasons.Winter)
		{
			System.out.println( "Its mansoon " );
		}
		else
		{
		     System.out.println( " its other seson  " );
		}
	}

}
