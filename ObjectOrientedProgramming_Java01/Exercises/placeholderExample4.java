public class placeholderExample4{
	
	public static void main (String[] args) {
	
		String mes = "2021";
		int n1 = 123456;

		// %s placeholder for the string variable mes to be printed out
		System.out.printf("Welcome %s %n", mes);
		
		// %10s filling from the right for spaces
		System.out.printf("Welcome %10s %n", mes);
		
		// %-10s filling from the left for spaces
		System.out.printf("Welcome %-10s %n", mes);

		// %d is for integers
		System.out.printf("Welcome %d %n", n1);
		System.out.printf("Welcome %10d %n", n1);
		System.out.printf("Welcome %010d %n", n1);  
		//System.out.printf("Welcome %-010d %n", n1);   %-010d not accepted, cannot have - and 0 together
		System.out.printf("Welcome %-10d %n", n1);   //can only choose between 0 or - NOT BOTH
		

	}
}