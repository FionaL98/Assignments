import java.util.Scanner;

public class conversions {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value: ");
		String strValue = in.next();
		int intNum = Integer.parseInt(strValue);
		double dblNum = Double.parseDouble(strValue);
		System.out.println(intNum + ", " + dblNum);
		
		//enter 5, then 5.0 then five and note what happens
	}
}