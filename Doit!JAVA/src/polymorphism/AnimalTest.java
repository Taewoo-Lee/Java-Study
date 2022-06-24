package polymorphism;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}

	private void moveAnimal(Animal animal) {
		// TODO Auto-generated method stub
		animal.move();
	}

}
