package FactoryDP.copy;

public class AmazonFactory {

	public Sales gerReference(String key) 
	{
		if(key.equals("phone"))
		{
			return new Electronics();
		}
		else 
		{
			return new Clothes();
		}
	}
}
