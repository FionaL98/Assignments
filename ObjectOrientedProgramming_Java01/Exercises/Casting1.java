public class Casting1 {

	public static void main(String[] args) {

		int num1 = 5;
		double num2 = 8.2;
		char letter = 'A';
		int ascE = 69;

		int num3 = (int)num2; // statement 1
		double num4 = num1; // statement 2
		int anA = letter; // statement 3
		char anE = (char)ascE; // statement 4
		
		//compiler gives error
		
			// int num3 = num2  - two different data types: int and double
			// compile cannot implicity convert, so we need to explicitly convert ourselves
			// cast by using (int)  so int num3 = (int)num2;
			
			// char anE = ascE  - char and int type
			// need to explicity change the data type
			// using (char)  so char anE = (char)ascE;
			
		char x = 69;
		// compiler was able to implicitly cast
			// 69 is predfined as E in hexademical number system in ASCII

		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);
		System.out.println("anA: " + anA);
		System.out.println("anE: " + anE);
		
		System.out.println("x: " + x);

	}
}