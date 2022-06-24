package exercise.chapter12;

import java.util.Objects;

class Student {
	protected String num;
	protected String name;

	public Student(String num, String name) {
		this.num = num;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return num == other.num;
	}

	@Override
	public String toString() {
		return num + ":" + name;
	}

}
