public class Casting{
	
	public static void main(String []args){
		
		char ch1 =65;
		// gives error when 65.5 but no error when just 65 because 65 can be converted to Char
		// predefined A = 65 according to ASCII so char data type can be converted
		
		char ch2 = (char)65.8;
		// explicit casting, we tell the program it has to change
		// digit after decimal is ignored
		
		System.out.println("ch1 is " +ch1);
		System.out.println("ch1 is " +ch2);

	}
}