package data_structures;

import java.util.ArrayList;

class Student
{
	
	int no;
	String name;
	
	Student(int no, String name)
	{
		this.no = no;
		this.name = name;
	}
	
	String get_details()
	{
		return "No "+this.no+"with name "+this.name;
	}
	
	
	
}



/*
 * as = [student1,student2,student3]
 */



public class Array_list {
	
	
	public static void  main(String a[])
	{
		//Student s = new Student(123,"harsha");
		
		//arraylist
		ArrayList<Student> as = new ArrayList<Student>();
		
		//adding values to array list example
		for(int i = 0;i<10;i++)
		{
			Student st = new Student(i,"harsha"+i);
			as.add(st);
		}
		
		//fetching values from array list
		for(Student stud:as)
		{
			System.out.println(stud.get_details());
		}
		
		
		
	
	}

}
