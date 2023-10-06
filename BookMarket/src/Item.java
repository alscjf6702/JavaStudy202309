
abstract public class Item {

	String bookId;
	String name;
	int unitPrice;

	public Item(String bookId, String name, int unitPrice) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	abstract String getBookId();

	abstract String getName();

	abstract int getUnitPrice();

	abstract void setBookId(String bookId);

	abstract void setname(String name);

	abstract void setUnitPrice(int unitPrice);

}