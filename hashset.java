import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>(); 
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.contains("Mazda"));// check is it available or not.

	}

}
