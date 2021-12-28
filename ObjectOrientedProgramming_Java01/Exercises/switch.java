import java.util.Scanner;
public class switch {
	
	public static void main (String[]args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		
		char grade = scanner.next().charAt(0);
		
		switch (grade) {
			case A:
				System.out.println("Excellent, your grade is " + grade);
				break;
			case B:
				System.out.println("Well done, your grade is + " + grade);
				break;
			case C:
				System.out.println("Well done, your grade is " + grade);
				break;
			case D:
				System.out.println("You passed, your grade is " + grade);
				break;
			case F:
				System.out.println("Better try again, your grade is " + grade);
				break;
			default: 
				System.out.println("Your grade isthe grade need to be Capital letter from A to F Only");
				break;
		}
		
	}	
}