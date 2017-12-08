import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		String tempString = "aaabbbbcccccdddddde";
		
		char []convertStr = tempString.toCharArray();
		Map<Character,Integer> countMap = new HashMap<Character,Integer>();
		
		for(int i=0;i<tempString.length();i++)
        {
        	
        	if(countMap.containsKey(convertStr[i]))
        	{
        		countMap.put(convertStr[i], (countMap.get(convertStr[i])+1));
        	}
        	else {
				
        		countMap.put(convertStr[i], 1);
			}
       	
        }
		
		
		Set<Character> keys = countMap.keySet();
        for(Character ch:keys){
          
                System.out.print(ch+""+countMap.get(ch));
           
        }
	}
	
}
