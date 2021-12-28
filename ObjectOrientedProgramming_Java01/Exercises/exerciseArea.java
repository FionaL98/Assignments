import java.util.Scanner;

public class exerciseArea{
	
	public static void main(String[] args) {
		
		Scanner keysIn = new Scanner(System.in);
		
		System.out.println("Enter Length: ");  
		//can remove the ln from println if you want to keep all on one line
		double length = keysIn.nextDouble();
		
		System.out.println("Enter Width: ");
		double width = keysIn.nextDouble();
		
		double area = length*width;
		System.out.println("The area of rectangle is: " + area);
		
	}
}