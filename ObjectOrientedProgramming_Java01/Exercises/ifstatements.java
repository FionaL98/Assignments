import java.util.Scanner;
public class ifstatements {

	public static void main (String [] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number to check if it is negative: ");
		int num = input.nextInt();
		
		if (num < 0) 
			System.out.println("The number is negative.");
		
	}
}