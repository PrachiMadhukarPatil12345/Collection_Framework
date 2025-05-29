package Advance_Java_Telusco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class List1 
{
	public static void main(String[] args)
	{
		Comparator<Student> com=new Comparator<Student>()
	 {
			public int compare(Student i ,Student j)
			{
				if(i.age>j.age)
				return 1;
				else
					return -1;
			}
			
	 };
	 
	 List<Student>studs=new ArrayList<>();
	 
	 studs.add(new Student(21,"nava"));
	 studs.add(new Student(22,"aj"));
	 studs.add(new Student(21,"pracho"));
	 
	 Collection.sort(studs,com);
	 for(Student s:studs)
	 {
		 System.out.println(s);
	 }

	}

}
