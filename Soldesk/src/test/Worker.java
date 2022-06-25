package test;

public class Worker {
	private int ID;
	private String name;
	private String department;
	private String address;
	private String birth;
	
	public Worker() {
	}

	public Worker(int iD, String name, String department, String address, String birth) {
		ID = iD;
		this.name = name;
		this.department = department;
		this.address = address;
		this.birth = birth;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

}
