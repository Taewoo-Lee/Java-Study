package object;

class Book {
	protected int bookNumber;
	protected String bookTitle;

	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber + "," + bookTitle;
	}

}
