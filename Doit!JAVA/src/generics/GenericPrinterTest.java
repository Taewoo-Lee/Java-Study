package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

		powderPrinter.setMetarial(new Powder());
		Powder powder = powderPrinter.getMetarial();
		System.out.println(powderPrinter);

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();

		plasticPrinter.setMetarial(new Plastic());
		Plastic plastic = plasticPrinter.getMetarial();
		System.out.println(plasticPrinter);
	}

}
