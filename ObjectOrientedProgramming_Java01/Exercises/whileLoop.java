import java.util.Scanner;

public class whileLoop {
	
	public static void main (String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter a number to find the sum or 0 to end: ");
		
		int sum = 0;
		int x;
		while ((x = input.nextInt()) != 0) {
			System.out.println("The sum of your numbers is: " + (sum+= x));
			System.out.print("Please enter another number: ");

		}
		System.out.println("The program has ended.");
	}
}