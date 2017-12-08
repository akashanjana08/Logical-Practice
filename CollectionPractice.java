import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPractice {

	public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Haunnat");  
		 // al2.retainAll(al);
		  al2.removeAll(al);
		  
		  System.out.println("iterating the elements after retaining the elements of al2..."+"--> "+ al2.size());  
		  Iterator<String> itr=al2.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
}