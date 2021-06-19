import java.util.HashMap;
public class hashmap {

	public static void main(String[] args) {
		HashMap<String, String> work = new HashMap<String, String>(); 
		work.put("Ranaghat", "India");//add data to HashMap
		work.put("Bagula", "France");
		System.out.println(work);
		System.out.println(work.get("Bagula")); //Accesss an Item
		System.out.println(work.remove("Bagula")); //remove data to HashMap
		System.out.println(work);
		System.out.println(work.size()); //know the size of the HashMap
		work.put("England", "London");
		work.put("Germany", "Berlin");
		work.put("Norway", "Oslo");
		work.put("USA", "Washington DC");
		for(String i:work.keySet()) { //to get the keys 
			System.out.println(i);
		}
		for(String i:work.values()) { //to get the values 
			System.out.println(i);
		}
	}

}
