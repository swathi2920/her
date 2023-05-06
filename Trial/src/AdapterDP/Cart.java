package AdapterDP;

public class Cart {
private int quantity;
private int price;

private Inventory i;

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public void setPrice(Inventory i) {
	this.i=i;
}
public void displayPrice(String prod)
{
	i.price(prod);
}
}
