package stream.serialization;

class Person {
	private static final long serialVersionUID = -1503252402544036183L;
	protected String name;
	protected String job;

	public Person() {
	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name + "," + job;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
