import java.util.Scanner;

public class assignment3 {

	public static void main (String [] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the first grade: ");
		int first = input.nextInt();
		System.out.print("Please enter the second grade: ");
		int second = input.nextInt();		
		
		if (first == second) {
			System.out.print("Both numbers are the same. \n The first number " + first + " is equal to the second number " + second);
		} else if (first > second ){
			System.out.print(first + " is greater than " + second);
			if (first % 2 == 0) {
				System.out.print(" and it is even ");
			} else{
				System.out.print(" and it is odd ");
			}
			if (first <= 100 && first >= 0) {
					System.out.print(" and " + first + " is within the range.");
				} else {
					System.out.print(" and " + first + " is NOT within the range.");
				}
		} else if (second > first){
			System.out.print(second + " is greater than " + first);
			if (second % 2 == 0) {
				System.out.print(" and it is even ");
			} else{
				System.out.print(" and it is odd ");
			}
			if (second <= 100 && second >= 0) {
					System.out.print(" and " + second + " is within the range.");
				} else {
					System.out.print(" and " + second + " is NOT within the range.");

				}
		} 

	}
}