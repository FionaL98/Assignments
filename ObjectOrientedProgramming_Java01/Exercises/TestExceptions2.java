import java.util.*;

public class TestExceptions2 {
	
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int number = in.nextInt();
			System.out.println("Root: " + Math.sqrt(number));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		//if user comes and enters the correct number, 
		//in int type then the program finishes try successfully and finishes
		
		//if user gives a string in try, 
		//it will jump to catch and itll send a message for error
		
		// catch happens when user enters wrong value 
		
		System.out.println("This is the end");

	}
}