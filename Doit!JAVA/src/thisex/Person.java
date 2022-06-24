package thisex;

class Person {
	protected String name;
	protected int age;
	
	public Person() {
		this("이름 없음", 1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
