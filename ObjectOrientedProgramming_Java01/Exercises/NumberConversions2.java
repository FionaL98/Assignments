import java.util.Scanner;

public class NumberConversions2 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the price: ");
		String s = input.nextLine();
		double price = Double.parseDouble(s);
		
		double tax = price * 0.13;
	
		System.out.printf("The sales tax is: %4.2f", tax);

	}

}