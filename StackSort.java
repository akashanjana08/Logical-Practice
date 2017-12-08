import java.util.Stack;

public class StackSort {
 
	
	/*static Stack<Integer> sortedStack(Stack<Integer> inputStackMethod)
	{
		
		Stack<Integer> tempStack = new Stack<>();
		
		while(!inputStackMethod.empty())
		{
			
			int temp = inputStackMethod.pop();
			
			while(!tempStack.empty() && tempStack.peek()>temp)
			{	
			  inputStackMethod.push(tempStack.pop());	
			}
			tempStack.push(temp);
		}
		
		return tempStack;
	}*/
	
	
	static Stack<Integer> sortedStack1(Stack<Integer> inputstack)
	{
		Stack<Integer> tempStack = new Stack<Integer>();
		
		while(!inputstack.empty())
		{
			int temp = inputstack.pop();
			
			while(!tempStack.empty() && tempStack.peek() > temp)
			{
				
				inputstack.push(tempStack.pop());
				
			}
			
			
			tempStack.push(temp);
		}
		return tempStack;
	}
	
	
	
	
	
	
	
  public static void main(String[] args) {
	
	  Stack<Integer> inputStack = new Stack<>();
	  inputStack.push(56);
	  inputStack.push(54);
	  inputStack.push(2);
	  inputStack.push(69);
	  inputStack.push(25);
	  inputStack.push(95);
	  System.out.println( sortedStack1(inputStack));
}
}
