
public class StringReverse {

	String reverse="";
	 String changeString(String str)
	{
		
		if(str.length()==1)
		{
			return str;
			
		}
		else {
			
			
			reverse += str.charAt(str.length()-1)
                    +changeString(str.substring(0,str.length()-1));
            return reverse;
		}
		
		
	}
	
	 
	 public static void main(String[] args) {
		
		 StringReverse sr = new StringReverse();
		 System.out.println(sr.changeString("AKASH"));
		 
	}
	 
	
}
