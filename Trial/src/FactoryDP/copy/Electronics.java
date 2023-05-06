package FactoryDP.copy;

public class Electronics implements Sales {

	@Override
	public void productDetails() 
	{
		int price=100;
		String color="Green";
		System.out.println("Electronics :  " +price + " "+ color);
		
	}

	

}
