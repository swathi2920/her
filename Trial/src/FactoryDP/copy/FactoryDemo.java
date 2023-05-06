package FactoryDP.copy;

public class FactoryDemo {

	public static void main(String[] args)
	{
		AmazonFactory p1= new AmazonFactory();
		Sales s1 = p1.gerReference("phone");
		s1.productDetails();
		
		Sales s2 = p1.gerReference("dress");
		s2.productDetails();
	}
}
/*
 *  Here the class is revealed to the clients , so use Factory concept
 */


