import static org.junit.Assert.*;

import org.junit.Test;

public class ContactTest {

	@Test
	public void testGetName() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		assertEquals("Sam Johnson", con.getName());
	}

	@Test
	public void testSetName() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		con.setName("John Samson");
		
		assertEquals("John Samson", con.getName());
	}

	@Test
	public void testGetPhone() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		assertEquals("123-456-7890", con.getPhone());
	}

	@Test
	public void testSetPhone() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		con.setPhone("123-123-1231");
		
		assertEquals("123-123-1231", con.getPhone());
	}

	@Test
	public void testGetEmail() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		assertEquals("sjohnson@gmail.com", con.getEmail());
	}

	@Test
	public void testSetEmail() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		con.setEmail("jSamson@gmail.com");
		
		assertEquals("jSamson@gmail.com", con.getEmail());
	}

	//these tests are not working, every time I run them, they say the actual is different, either including the word company or not.
	@Test
	public void testGetCompany() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		assertEquals("[name=walmart, address=123 Main St, phone=111-111-1111]", con.getCompany());
	}

	@Test
	public void testSetCompany() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		Company com2 = new Company("walgreens","456 Central Ave","222-222-2222");
		
		con.setCompany(com2);
		
		assertEquals("[name=walgreens, address=456 Central Ave, phone=222-222-2222]", con.getCompany());
	}

	@Test
	public void testToString() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		Contact con = new Contact("Sam Johnson", "123-456-7890", "sjohnson@gmail.com", com);
		
		assertEquals("Contact [name=Sam Johnson, phone=123-456-7890, email=sjohnson@gmail.com, company=[name=walmart, address=123 Main St, phone=111-111-1111]]", con.toString());
	}

}
