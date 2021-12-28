import java.util.Scanner;

public class truthExercise {

	public static void main (String [] args) {
	
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		//solution without if
		//boolean to determine true of false with the comparision expressions
		System.out.println("Divisible by 2 and 3? " + (num%2==0&&num%3==0));
		System.out.println("Divisible by 2 or 3?"+(num%2==0||num%3==0));
		System.out.println("Divisible by 2 or 3 but not both?"+(num%2 ==0 ^ num%3==0));
		
		/* using the if statement
		
		if (num%2 == 0 && num%3 == 0){
			System.out.println("Your number is divisible by 2 and 3");
		} else if ((num % 2 ==0) || (num % 3 == 0)) {
			System.out.println("Your number is divisble by 2 or 3");
		} else {
			System.out.println("Your number is not divisble by 2 or 3");
		}
		
		*/
	
	}
}