package BuilderDP;

public class Search 
{
	private String model;
	private int price;
	public Search(String model,int price) {
		this.model=model;
		this.price=price;
	}
	@Override
	public String toString() {
	return "Search["+model +"  "+ price+"]";
	}

}
