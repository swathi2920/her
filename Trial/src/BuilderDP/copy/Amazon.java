package BuilderDP.copy;

public class Amazon {
	public static void main(String[] args) {
		Search s= new Builder().setModel("M-100").setPrice(900).getSearch();
		System.out.println(s.toString());
	}

}


/*
 * Here we need to pass the complete input as per Constructor,
 * we cant pass partial input. so we need Builder Design Pattern- use setters()
*/
