import java.util.HashSet;
import java.util.LinkedHashMap;

public class LongestSubstring {

	
	static void findLongestString(String inputString){
		
		char []inputStringArray =  inputString.toCharArray();
		LinkedHashMap<Character, Integer> tempColloc = new LinkedHashMap<>();
		for(int i=0 ; i<inputStringArray.length ;i++)
		{
			
			if(!tempColloc.containsKey(inputStringArray[i]))
			{
				tempColloc.put(inputStringArray[i], i);
			}else{
				i = tempColloc.get(inputStringArray[i]);
				tempColloc.clear();
			}
		}
		System.out.println(tempColloc.keySet());
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		String testString ="AKASH";
		findLongestString(testString);
	}  
}
