interface addition{
	int add(int x,int y);
}

public class lambdaexpression {

	public static void main(String[] args) {
		
		addition z = (x,y) -> (x+y);
		
		System.out.print(z.add(56, 69));

	}

}
