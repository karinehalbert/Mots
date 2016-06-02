
public class Main {

	public static void main(String[] args) {

		String test = "test";
		System.out.println("Test sufix : "+Sufix.transform(test));
		System.out.println("Test prefix : "+Prefix.transform(test));
		System.out.println("Test maj : "+Maj.transform(test));
	}

}
