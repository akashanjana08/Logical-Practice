import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee
{

	private int age;
	private String name;

	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


class AgeCompare implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		if(e1.getAge()>o2.getAge())
		  return 1;
		else if(e1.getAge()<e2.getAge())
			return -1;
		else
			return 0;
	}
}

class NameCompare implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}



public class ComparatorExample {

	
	public static void main(String[] args) {
		
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(new Employee(25, "Vishnu"));
		listEmp.add(new Employee(62, "Ashok"));
		listEmp.add(new Employee(23, "Bhanu"));
		for (Employee employee : listEmp) {
			System.out.println(employee.getAge() + " ---" + employee.getName());
		}
		
		System.out.println("\n\n\n");
		Collections.sort(listEmp, new NameCompare());
		
		for (Employee employee : listEmp) {
			System.out.println(employee.getAge() + " ---" + employee.getName());
		}
		
	}
}
