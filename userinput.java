import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your Name & Age");
		String username = sc.nextLine();
		Integer age = sc.nextInt();
		System.out.println("Your name is " .concat(username)  + " Age is " + age);
		sc.close();
	}

}
