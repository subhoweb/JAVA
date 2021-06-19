class aoys{
	void eat() //method
	{
		System.out.println("eating...");
	}
}
class boys extends aoys{
	void eat()
	{
		System.out.println("barking...");
	}
}
public class polymorphism {

	public static void main(String[] args) {
		aoys objs = new aoys();
		objs.eat();

	}

}
