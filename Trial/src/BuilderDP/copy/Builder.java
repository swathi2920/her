package BuilderDP.copy;

public class Builder 
{
	private String model;
	private int price;
	
	public Builder setModel(String model) {
		this.model = model;
		return this;
	}
	
	public Builder setPrice(int price) {
		this.price = price;
		return this;
	}
	public Search getSearch()
	{
		return new Search(model,price);
	}
	
	
}
