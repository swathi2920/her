package AdapterDP;

public class Store implements Inventory
{
	Owner o=new Owner();
	
	@Override
	public void price(String str) {
		o.finalPrice(str);
	}
}
