import java.util.HashSet;
import java.util.LinkedHashMap;

public class LongestSubstring {

	static void longestSubstring(String inputString)
    {
        LinkedHashMap<Character, Integer> tempmap = new LinkedHashMap<Character, Integer>();
        char inputChar[] = inputString.toCharArray();
        
        for(int i=0 ; i< inputChar.length ;i++)
        {
        	if(!tempmap.containsKey(inputChar[i]))
        	{
        		tempmap.put(inputChar[i], i);
        	}
        	else
        	{
        		
        		i = tempmap.get(inputChar[i]);
        		tempmap.clear();
        	}
        	
        }
        
        System.out.println(tempmap.keySet().toString());
        
        
    }
     
    public static void main(String[] args) 
    {    
        //longestSubstring("javaconceptoftheday");
         
        System.out.println("==========================");
         
        longestSubstring("AKASH");
    }    
}
