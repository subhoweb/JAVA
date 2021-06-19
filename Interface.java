interface myanimal{
	public void sleep();
	public void animalsound();
}

class pigs implements myanimal{
	
	public void animalsound(){
		System.out.println("Buzzzzzzz");
	}	
	public void sleep(){
		System.out.println("I am sleeping now");
	}
	
}

class Interface {
	public static void main(String[] args) {
		pigs x = new pigs();
		x.animalsound();
		x.sleep();
		
	}

}
