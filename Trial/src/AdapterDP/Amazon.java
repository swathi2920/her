package AdapterDP;

public class Amazon {
	public static void main(String[] args)
	{
		Inventory obj = new Store();
		Cart c = new Cart();
		c.setPrice(obj);
		c.displayPrice("phone");
	}

}
