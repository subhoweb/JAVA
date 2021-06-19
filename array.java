public class array {
	public static void main(String args[])
	{
		String[] cars = {"volvo","tata","bmw","honda"};//1D Array
		System.out.println(cars[0]); // Array indexing
		
		cars[0] = "Splendor";
		System.out.println(cars[0]);// Array Value change
		
		for(String i:cars)
		{
		      System.out.println(i); //Array Elements Print
	    } 
		
		int[][] myint = {{1,2,3,4},{5,6,7}};//2D Array
		int x = myint[1][2];
		System.out.println(x); 
	}
}
