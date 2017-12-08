import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Top2MaxNumber {


	static int nums[] = {5,23,215,744,870,12};
	static int co = 0;
	public static void main(String[] args) {
		
		SortedSet<Integer> ss = new TreeSet<Integer>();
		for(int a:nums)
		{
			ss.add(a);
		}
		
		if(ss.size()>=2)
		{
			
			Iterator<Integer> i=ss.iterator();
			while(i.hasNext())
			{
			  nums[co] = (Integer)i.next();
			  co++;
			}
			
			System.out.println(nums[nums.length-1]);
			System.out.println(nums[nums.length-2]);
		}
	}
}
