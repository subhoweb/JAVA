//Exception Handling program using throw 
public class throwexception {
	static void myint(int age){
		if(age<18)
		{
			throw new ArithmeticException("Access Denied.."); //Throw keyword
		}
		else
		{
			System.out.print("Ready to go");	
		}			
}
	public static void main(String[] args) {
		myint(22); //Function Call
	}
}
