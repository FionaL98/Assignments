import java.util.Scanner;
public class biggerNumEven{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer:");
		int num1 = input.nextInt();		
		System.out.print("Enter second integer:");
		int num2 = input.nextInt();

		if (num1>num2){
			if (num1 % 2 == 0) {
				System.out.println("Num1 is even.");
			} else {
				System.out.println("Num1 is odd.");
			}
			System.out.println("Num1 is greater than num2");
		} else if (num2>num1) {
			if (num2 % 2 == 0) {
				System.out.println("Num2 is even.");
			} else {
				System.out.println("num2 is not even.");
			}
			System.out.println("Num2 is greater than num1");
		} 

}
}