package BuilderDP;

public class Amazon {
	public static void main(String[] args) {
		Search s= new Search("M-100" , 700);
		System.out.println(s.toString());
	}

}


/*
 * Here we need to pass the complete input as per Constructor,
 * we cant pass partial input. so we need Builder Design Pattern- use setters()
*/
