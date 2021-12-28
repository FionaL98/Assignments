// Fiona Li-Duong / liduong

import java.util.Scanner;
public class Assignment2 {
	
	public static void main (String [] args) {
				
		Scanner input = new Scanner(System.in);
		
		// INPUT 5 INTEGER NUMBERS FROM THE KEYBOARD
		System.out.print("Enter your first number:");
		int first = input.nextInt();
		System.out.print("Enter your second number:");
		int second = input.nextInt();
		System.out.print("Enter your third number:");
		int third = input.nextInt();
		System.out.print("Enter your fourth number:");
		int fourth = input.nextInt();
		System.out.print("Enter your fifth number:");
		int fifth = input.nextInt();
		
		//FIND THE FOLLOWING: SUM OF ALL NUMBERS, AVG OF ALL NUMBERS, SQUARE ROOT OF SUM AND CUBE OF EACH NUMBER
		int sum = first + second + third + fourth + fifth;
		double avg = sum/5.0;		
		double sqRt = Math.sqrt(sum); 
		
		double first3 = Math.pow(first,3);
		double second3 = Math.pow(second,3);
		double third3 = Math.pow(third,3);
		double fourth3 = Math.pow(fourth,3);
		double fifth3 = Math.pow(fifth,3);

		//OUTPUT SHOULD LOOK LIKE SO 
		System.out.println("\n Number \t \t Cube of each Number");
		System.out.println("----------------------------------------------------");
		
		System.out.printf("Num1= %-20d Num1^3= %.1f%n" ,first, first3);
		System.out.printf("Num2= %-20d Num2^3= %.1f%n" ,second, second3);
		System.out.printf("Num3= %-20d Num3^3= %.1f%n" ,third, third3);
		System.out.printf("Num4= %-20d Num4^3= %.1f%n" ,fourth, fourth3);
		System.out.printf("Num5= %-20d Num5^3= %.1f%n%n" ,fifth, fifth3);
		
		System.out.printf("Sum of all numbers = %d%n", sum);
		System.out.printf("Average of all numbers = %.2f%n", avg);
		System.out.printf("Square Root of Sum = %.2f%n", sqRt);
		
		System.out.println("----------------------------------------------------");

		
	}

}