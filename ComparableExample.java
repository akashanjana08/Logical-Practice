import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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


/* Difference between Comparable and Comparator
1) Comparable provides single sorting sequence. In other words, we can sort the collection on the basis of single element such as id or name or price etc.	Comparator provides multiple sorting sequence. In other words, we can sort the collection on the basis of multiple elements such as id, name and price etc.
2) Comparable affects the original class i.e. actual class is modified.	Comparator doesn't affect the original class i.e. actual class is not modified.
3) Comparable provides compareTo() method to sort elements.	Comparator provides compare() method to sort elements.
4) Comparable is found in java.lang package.	Comparator is found in java.util package.
5) We can sort the list elements of Comparable type by Collections.sort(List) method.	We can sort the list elements of Comparator type by Collections.sort(List,Comparator) method.*/
