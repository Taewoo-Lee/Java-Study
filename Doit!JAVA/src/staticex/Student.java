package staticex;

class Student {
	static int serialNum = 1000;
	protected int studentID;
	private String studentName;
	protected int grade;
	protected String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
