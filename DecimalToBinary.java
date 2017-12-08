
public class DecimalToBinary {

	
	public static void main(String[] args) {
		
		decimalToBinary(12);
		
		System.out.println(Integer.toBinaryString(12));
	}
	
	
	
	
	static void decimalToBinary(int number)
	{
		int binNum;
		while(number/2 !=0)
		{
			binNum = number%2;
			number = number/2;
		    System.out.print(binNum);
			
		}
		System.out.println();
	}
}
