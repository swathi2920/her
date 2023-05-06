package TDD;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TDDdemo {

//	@Test
//	public void forNullReturn() {
//		Sample s = new Sample();
//		//s.firstChar("ABCD");
//		Assert.assertEquals(s.getNull("ABCD"),"ABCD");
//	}
//	@Test
//	public void charInFirstPosition() {
//		Sample s = new Sample();
//		//s.firstChar("ABCD");
//		Assert.assertEquals(s.firstChar("BACD"),"BCD");
//	}
//	@Test
//	public void charAnyPosition() {
//		Sample s = new Sample();
//			Assert.assertEquals(s.onlyFirstChar("BBAA"),"BBAA");
//	}
//	@Test
//	public void only2char() {
//		Sample s = new Sample();
//			Assert.assertEquals(s.onlyFirstChar("AB"),"B");
//	}
//	@Test
//	public void only1char() {
//		Sample s = new Sample();
//			Assert.assertEquals(s.onlyOneChar("B"),"B");
//	}
//	@Test
//	public void only1charA() {
//		Sample s = new Sample();
//			Assert.assertEquals(s.onlyOneCharA("A"),"");
//	}
	@Test
	public void T1() {
		int[] num1 = {10,20,30};
		int[] num2 = {20,10,30};
		Arrays.sort(num2);
		Assert.assertEquals(num2, num1);
		
		coverageDemo c= new coverageDemo();
		c.testing();
	}
	@Test(expectedExceptions=NullPointerException.class)
	public void T2() {
		int[] num1 =null;		
			Arrays.sort(num1);
		System.out.println(num1);
		System.out.println("ok");
	}
	@Test(expectedExceptions=ArithmeticException.class)
	public void T3() {
		int x=99;
		int y=0;
			System.out.println(x/y);
		System.out.println("ok");
	}
	@Test(expectedExceptions=NullPointerException.class)
	public void T4() {
			int[] num1 = {};
			Arrays.sort(num1);
		System.out.println(num1);
		System.out.println("ok");
		
	}
}
