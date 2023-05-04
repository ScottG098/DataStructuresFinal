import java.util.Stack;
public class Sort {

	static Stack<Contact> sortStack (Stack<Contact> s) 
	{	
		Stack<Contact> temp = new Stack<>();
		while(!s.empty()) 
		{
			Contact topInStack = s.pop();
			while (!temp.empty() && temp.peek().getName().compareTo(topInStack.getName()) > 0) 
			{
				Contact topTempStack = temp.pop();
				s.push(topTempStack);
			}
			temp.push(topInStack);
		}
		return temp;
	}
	
}
