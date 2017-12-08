import java.util.Stack;

public class StackSort {
 
	public static void main(String[] args) {
		
		Stack<Integer> inputStack = new Stack<>();
		inputStack.push(65);
		inputStack.push(7);
		inputStack.push(54);
		inputStack.push(5);
		inputStack.push(22);
		inputStack.push(92);
		System.out.println(sortStack(inputStack));

	}
	
	
	static Stack<Integer> sortStack(Stack<Integer> inputStack)
	{
		Stack<Integer> tempStack = new Stack<>();
		while(!inputStack.empty())
		{
			int temp = inputStack.pop();
			while(!tempStack.empty() && tempStack.peek() > temp)
			{
	           inputStack.push(tempStack.pop());			
			}
			tempStack.push(temp);
		}
		return tempStack;
	}
	
	
	
}
