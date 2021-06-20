//Exception Handling program
public class exception {

	public static void main(String[] args) {
		try{
			int[] num = {1,2,3,4}; //Array declare
			System.out.print(num[8]); //find the element in the array
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("Something went wrong");
		}

	}

}
