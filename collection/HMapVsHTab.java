package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HMapVsHTab {

	
	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("ss", null);
		
		System.out.println(map);
		
		
	}
}
