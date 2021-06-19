abstract class animal{
	public abstract void animalsound();
	public void sleep(){
		System.out.println("I am sleeping now");
	}
}

class pig extends animal{
	public void animalsound(){
		System.out.println("Buzzzzzzz");
	}
}

public class abstraction {
	public static void main(String[] args) {
		pig myobject = new pig();
		myobject.sleep();
		myobject.animalsound();
	}

}
