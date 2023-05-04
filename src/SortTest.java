import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class SortTest {

	@Test
	public void testSortStack() {
		Stack<Contact> testStack = new Stack<Contact>();
		
		Company com1 = new Company("walmart","123 Main St","111-111-1111");
		Contact con1 = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com1);
		
		Company com2 = new Company("target","123 Main St","111-111-1111");
		Contact con2 = new Contact("Arthur Morgan", "123-456-7890", "sjohnson@gmail.com", com2);
		
		Company com3 = new Company("hyvee","123 Main St","111-111-1111");
		Contact con3 = new Contact("John Marston", "123-456-7890", "sjohnson@gmail.com", com3);
		
		testStack.add(con3);
		testStack.add(con2);
		testStack.add(con1);
		
		testStack = Sort.sortStack(testStack);
		
		assertEquals("Sam Johnson",testStack.peek().getName());
		
		
	}

}
