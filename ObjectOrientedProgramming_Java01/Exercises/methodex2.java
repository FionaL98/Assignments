import java.util.Scanner;

public class methodex2 {
	
	public static void main (String[]args){
		
		/*Write a java program that accepts the side of a square from
		the user and calculate the square perimeter 
		by defining a method called Sperimeter.
		Print the result in the main method.*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side of the square: ");
		double s = input.nextDouble();

		double sp = Sperimeter(s);
		System.out.println("the square perimeter is = " + sp);
	
	}
	
	public static double Sperimeter(double side) {
		return side*4;

	}
}