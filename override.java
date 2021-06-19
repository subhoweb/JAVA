class vehicle{
		static void runmethod(){
			System.out.println("Vehicle is running");
			}  
}
class Bike extends vehicle{  
		 static void runmethod(){
			System.out.println("Bike is running safely");
		    }  
}
	
public class override {		
	public static void main(String[] args) {
	Bike obj = new Bike(); //Bike == class name
	obj.runmethod();
 }

}
