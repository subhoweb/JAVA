public class paramiterconstruct {
	int x;
	
	public paramiterconstruct(int y) //passing parameters through a constructor
	{
		x = y; //Declare the value
	}
	
	public static void main(String[] args) {
		
	paramiterconstruct youobj = new paramiterconstruct(56); // calling the function with the value
	System.out.print(youobj.x);

	}

}
