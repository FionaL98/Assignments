public class placeholderExample3{
	
	public static void main (String[] args) {
	
		double num1 = 1.12; //123.1269 
		String mes = "2021";

		// 10 total spaces with empty spaces
		System.out.printf("First is:%10.3f%n",num1);
		
		// filled it with zeros in the front for total 10spaces with 0s
		System.out.printf("First is:%010.3f%n",num1);
		
		// alignment 
		System.out.printf("First is:%-10.3f%n",num1);
	
		// %s placeholder for the string variable mes to be printed out
		System.out.printf("Welcome %s%n", mes);

	
	}
}