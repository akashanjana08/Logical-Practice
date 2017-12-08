import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

class Student implements Comparable<Student>
{
	
	int age;
	String name;
		
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		
		if(age>st.age)
			return 1;
		else if(age<st.age)
			return -1;
		else if(age==st.age)
			return 0;
		else {
			return 0;
		}	
	}
}


public class ComparableExample {
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> coll=new ArrayList<Student>();  
		coll.add(new Student(25, "Akash"));
		coll.add(new Student(30, "Stish"));
		coll.add(new Student(22, "Alok"));
		
		
		Collections.sort(coll);
		
		for (Student student : coll) {
			
			System.out.println(student.age+" -- "+ student.name);
		}
		
		
	}

}
