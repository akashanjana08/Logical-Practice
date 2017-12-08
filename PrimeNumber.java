
public class PrimeNumber {

	public static void main(String[] args) {
		
			System.out.println(isNumberPrime(8));
	}
	
	static boolean isNumberPrime(int number){
		
		for(int i=2;i<=number/2;i++)
		{
			if((number%i)==0){
				return false;
			}
		}
		return true;
		
	}
}
