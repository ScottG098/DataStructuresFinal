//contact class, stored in a stack by driver, contains embedded company class as property
public class Contact implements Comparable<Contact>{

	private String name;
	private String phone;
	private String email;
	private Company company;
	public Contact() {
		super();
	}
	public Contact(String name, String phone, String email, Company company) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.company = company;
	}
	public Contact(String name, Company company) {
		super();
		this.name = name;
		this.company = company;
	}
	public Contact(String name, String email, Company company) {
		super();
		this.name = name;
		this.email = email;
		this.company = company;
	}

	public Contact(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + ", email=" + email + ", company=" + company + "]";
	}
	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
