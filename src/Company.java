
public class Company {

	private String name;
	private String address;
	private String phone;
	public Company() {
		super();
	}
	public Company(String name) {
		super();
		this.name = name;
	}
	public Company(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public Company(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}



}
