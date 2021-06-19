import java.util.ArrayList;

public class arr {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); 
		cars.add("BMW");//add
		cars.add("VOLVO");
		cars.add("TATA");
		cars.add("FORD");
		String a = cars.get(0); //get
		cars.set(0, "MYOWN");//update
		cars.remove(0);//remove
		System.out.println(cars);
		System.out.println(a);
		System.out.println(cars.size());// size of the array
	}
}
