public class defaultconstruct {
	int x;
	
	public defaultconstruct () // Default constructor
	{
		x = 5; 
	}
	
	public static void main(String[] args) {
	
		defaultconstruct mynewobj = new defaultconstruct(); //call the constructor as a function where you have some value
		System.out.println(mynewobj.x);

	}

}
