
public class ReverseNumber {

	
	public static void main(String[] args) {
		
		
		System.out.println(returnNumber(1234));
	}
	
	
	
	
	
	static String  returnNumber(int number)
	{
		int revNum=0;
		String revSt="";
		while((number%10) !=0)
		{
			revNum = number%10;
		  	number = number/10;
		  	System.out.print(revNum);
		  	revSt+=revNum+"";
			
		}
		System.out.println();
		return revSt;
		
	}
	
}
