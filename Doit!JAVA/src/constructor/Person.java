package constructor;

class Person {
	protected String name;
	protected float height;
	protected float weight;
	
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
}
