public class ovrload {
	
	static int plusmethod(int x, int y){	
		return x + y;
	}
	
	static double plusmethod(double x, double y){	
		return x + y;
	}
	
	public static void main(String[] args) {
		int num = plusmethod(11,8);
		double nums = plusmethod(5.2,3.6);
		System.out.println("Int: " + num);
		System.out.println("Double: " + nums);
		
	}

}
