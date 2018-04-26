package clone;

import java.util.ArrayList;
import java.util.List;

public class MainBookDealer {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookStore bks = new BookStore();
		bks.setStoreName("Novelty");
		bks.loadBooks();
		bks.getBookList().remove(2);
		System.out.println(bks);
		
		
		BookStore bks1 = (BookStore)bks.clone();
		bks1.setStoreName("Vovelty");
		bks1.loadBooks();
		System.out.println(bks1);
		
	}
}
