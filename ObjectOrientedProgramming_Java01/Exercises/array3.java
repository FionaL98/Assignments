import java.util.Scanner;

public class array3 {

	public static void main (String []args){
	
		Scanner input = new Scanner (System.in);
		
		double[] grades = new double[5];
		
		double max = 0;
		double min = 1000;
		
		for (int i=0; i<grades.length; i++){
			System.out.print("Enter the Mark: ");
			grades[i] = input.nextDouble();
			
			if (grades[i] > max ) {
				max = grades[i];
			} 
			
			if (grades[i] < min){
				min = grades[i];
			}

		}
		
		System.out.println("Array Values are: ");

		for (int i=0; i<grades.length; i++){
		System.out.print(grades[i] + ", ");
			
		}
		System.out.println( " ");

		
		System.out.println("The max value is: " + max);
		System.out.println("The min value is: " + min);
		

		
	}
}