package clone;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable{

	private String storeName;
	private List<Book> bookList = new ArrayList<Book>();

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	
    public void loadBooks(){
		
    	for(int i=1 ; i<=10 ; i++){
			Book bk = new Book();
			bk.setBookId(i+"");
			bk.setBookName("Book "+i);
			getBookList().add(bk);
		}
	}
	

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "BookStore [storeName=" + storeName + ", bookList=" + bookList + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
