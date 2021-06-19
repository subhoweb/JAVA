import java.util.ArrayList;
import java.util.Iterator;
public class iterator{

	public static void main(String[] args) {
		
		ArrayList<String> mycars2 = new ArrayList<String>();
		mycars2.add("Volvo");
		mycars2.add("BMW");
		mycars2.add("Ford");
		mycars2.add("Mazda");
		
		Iterator<String> itvar = mycars2.iterator(); //Iterator Creation
		
		System.out.println(itvar.next()); //Print only the 1st element
		
		while(itvar.hasNext()){
			
			System.out.println(itvar.next()); //Print all element one by one

		}
		
	}
}
