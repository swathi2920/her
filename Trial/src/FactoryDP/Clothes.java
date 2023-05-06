package FactoryDP;

public class Clothes implements Sales
{
	@Override
	public void productDetails() 
	{
		int price=500;
		String color="Red";
		System.out.println("Clothes  :  " +price + " "+ color);
	}
}
