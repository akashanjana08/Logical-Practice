package overriding;

class Base{
	
	int a=10;
	void show(){
		System.out.println(a);
	}
	
	void displayshow(){
		show();
	}
	
}


public class Child extends Base{

	int a=20;
	public Child() {
		// TODO Auto-generated constructor stub
		super.a = a;
	}
	
	public static void main(String[] args) {
		new Child().show();
	}
}