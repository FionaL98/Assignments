import java.util.Scanner;

public class tryScanner {
	
	public static void main(String[] args) {
		
		Scanner keysIn = new Scanner(System.in);
		System.out.println("Enter an integer: ");

		//enters a number
		int num = keysIn.nextInt();
		System.out.println("Your int: " + num);
		System.out.println("---------");
		
		//enters a value
		System.out.println("Enter a floating-point value:");
		double num2 = keysIn.nextDouble();
		System.out.println("Your floating-point: " + num2);
		System.out.println("---------");
		
		//enters a string but it ends before user input
		System.out.println("Now enter a string.");
		// String str = keysIn.nextLine(); // this gave us a problem so let's change to just next()
		// it is better to use the nextline() but just don't use it as last in your code. move it to the top
		String str = keysIn.next();
		System.out.println(str);
	}
}