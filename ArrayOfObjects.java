/**
 * 
 */
package Advance_Java_Telusco;

class Abc
{
	int prn;
	String name;
	
	
	Abc(int x,String y)
	{
		this.prn=x;
		this.name=y;
		/*
		 * System.out.println( prn); System.out.println( name);
		 */
	}
	
}

public class ArrayOfObjects {

	public static void main(String[] args)
	{
		           // ArrayOfObjects is array of objects 
		
			Abc a1=new Abc(1,"hhbh");
			Abc a2=new Abc(2,"fffff");
			Abc a3=new Abc(3,"kkkkbhh");
			Abc a4=new Abc(4,"bvdfcv");
			Abc a5=new Abc(9,"hhbh");
			Abc a6=new Abc(3,"zzzz");
			
			Abc [] ArrayOfObjects = {a1,a2,a3,a4,a5,a6};
			
			/*
			 * ArrayOfObjects[0]=a1; 
			 * ArrayOfObjects[1]=a2; 
			 * ArrayOfObjects[2]=a3;
			 * ArrayOfObjects[3]=a4;
			 *  ArrayOfObjects[4]=a5; 
			 *  ArrayOfObjects[5]=a6;
			 */
			// ArrayOfObjects= {a1,a2,a3,a4,a5,a6};
			
			
			
			
		for(int i=0;i<ArrayOfObjects.length;i++)
		{
			System.out.print(ArrayOfObjects [i].prn + " \n " );
			System.out.print(ArrayOfObjects [i].name + " \n");
		}

	}

}
