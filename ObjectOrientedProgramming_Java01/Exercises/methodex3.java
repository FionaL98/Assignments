import java.util.Scanner;

public class methodex3 {
	
	public static void main (String[]args){
		
		/*
		Write a java program that accepts a number from the user, then pass it to a method called even
		The method returns even or odd based on the passed number.
		In the main method print the number and call the method to show if it is even or odd.
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();

		System.out.println(x);
		System.out.println(even(x));
	
	}
	
	public static String even(int num) {
		if (num % 2 == 0 ){
			return "even"; 
		} else {
			return "odd"; 
		}
		

	}


}