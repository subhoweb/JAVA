class aoy{
	void eat()
	{
		System.out.println("eating...");
	}
}
class boy extends aoy{
	void bark()
	{
		System.out.println("barking...");
	}
}

class inheritence {

	public static void main(String[] args) {
	boy myobjd =new boy();
	myobjd.eat();
	myobjd.bark();

	}

}
