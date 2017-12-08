
public class SumOfPrimaryNum {

	
	public static void main(String[] args) {
		
	  int count = 2;
	  int countLoop=0;
	  int sum=0;
	  while(countLoop<100)
	  {
		  if(isNumberPrime(count))
		  {
			 System.out.print(count+" ,");
			 sum+=count;
			 countLoop++;
		  }
		  count++;
	  }
	  System.out.println();
	  System.out.println("Sum :"+sum);
	  System.out.println("Total Count :"+countLoop);
	}
	
	
	static boolean isNumberPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
			{
				return false;
			}
			
		}
		
		return true;
	}
}
