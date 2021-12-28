import java.util.Scanner;

public class placeholderActivity{
	
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();

		System.out.print("Enter your first mark: ");
		double mark1 = input.nextDouble();
		
		System.out.print("Enter your second mark: ");
		double mark2 = input.nextDouble();

		double sum = mark1 + mark2;
		double avg = sum / 2;

		// %f is placeholder for double 
		// %d is placeholder for int
		System.out.printf("Your name is:%s %n" ,name);
		System.out.printf("Your first mark is:%d %n" ,mark1);
		System.out.printf("Your second mark is:%d %n" ,mark2);
		System.out.printf("Your avaerage is:%d %n" ,avg);

		//another way
			//System.out.printf("Your name:%s%n First mark:%f%n Second mark:%f%n Your average:%f%n",name,mark1,mark2,avg);
		
		

	}
}