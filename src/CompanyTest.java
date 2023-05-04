import static org.junit.Assert.*;

import org.junit.Test;

public class CompanyTest {
	

	@Test
	public void testGetName() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		assertEquals("walmart", com.getName());
	}

	@Test
	public void testSetName() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		com.setName("Walgreens");
		assertEquals("Walgreens", com.getName());
	}

	@Test
	public void testGetAddress() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		assertEquals("123 Main St", com.getAddress());
	}

	@Test
	public void testSetAddress() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		com.setAddress("456 Central Ave");
		assertEquals("456 Central Ave", com.getAddress());
	}

	@Test
	public void testGetPhone() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		assertEquals("111-111-1111", com.getPhone());
	}

	@Test
	public void testSetPhone() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		com.setPhone("222-222-2222");
		assertEquals("222-222-2222", com.getPhone());
	}

	@Test
	public void testToString() {
		Company com = new Company("walmart","123 Main St","111-111-1111");
		assertEquals("[name=walmart, address=123 Main St, phone=111-111-1111]", com.toString());
	}

}
