package FactoryDP;

public class FactoryDemo {

	public static void main(String[] args)
	{
		Sales s1= new Electronics();
		s1.productDetails();

		Sales s2= new Clothes();
		s2.productDetails();
	}
}
/*
 *  Here the class is revealed to the clients , so use Factory concept
 */


