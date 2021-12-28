import java.util.Scanner;

public class switchLoop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the a number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the next number: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter your operator: +,-,/,*: ");
		char o = input.next().charAt(0);
		
		switch(o){
			case '+': 
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case '%':
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
				break;
			case '*':
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
				break;
			default: 
				System.out.println("Error");
				System.exit(1);
		}
		
	}
}