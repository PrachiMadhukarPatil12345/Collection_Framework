package Advance_Java_Telusco;
public class Array_1d_2d {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int myarr[]= {24,67,87,90,45};
		
		
		for(int values:myarr)
		{
			System.out.println( values);
		}
		 
		int[] myarrr2 = new int[100];
		
		for (int x: myarrr2)
		{
			x= (int)(Math.random()  *50);
			System.out.print( "/n " +x + " ");
		}
		
		
		
		System.out.print( "  ");
		System.out.println( " ------2 dD Array----");
		
		int my2darr[] []=new int[4][3]; // 4: no of array 3 no of element in each array
		
		/*   
		my2darr[0][0]=56;
		my2darr[0][1]=56;
		my2darr[3][2]=56;
		my2darr[3][1]=56;   
		
		System.out.println(my2darr[2][3] );
		*/
		
		
		
		for(int val[]:my2darr)
		{
			for (int j:val)
			{
				j=(int)(Math.random()*10);
				System.out.print(j);
				
			}
			System.out.println( );
		}
		
	}
}


