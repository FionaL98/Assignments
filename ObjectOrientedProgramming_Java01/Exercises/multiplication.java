import java.util.Scanner;

public class multiplication {
	
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = in.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = in.nextDouble();
		double result=num1*num2;
		System.out.printf("First number entered is:%f second number entered is:%f multiplication is:%f",num1,num2,result);
	}
}