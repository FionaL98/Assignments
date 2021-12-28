import java.util.Scanner;

public class methodex1 {
	
	public static void main (String[]args){
				
		/*write a program that asks the user for width and lenght of rectangle
		then pass these values to a method called RecArea that calculates the
		area and returns it to the main 
		print the area in the main program.*/

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the width: ");
		double w = in.nextDouble();
		System.out.print("enter the length: ");
		double l = in.nextDouble();
		double area = RecArea(l,w);
		System.out.println("the rectnagle area = " +area);
	
	}
	
	public static double RecArea(double length, double width) {
		return length*width;

	}
}