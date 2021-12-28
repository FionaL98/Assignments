public class placeholderExample2{
	
	public static void main (String[] args) {
	
		double num1 =123.1269 ;//  1.12
		double num2 =789.2179 ;//  9.21
		double result=num1*num2;
		
		//%.2f just want 2 digits after decimal so 123.1269 becomes 123.13 by rounding up 
		//%5.3f total is 5 and 3 digits after the decimal so 123.1269 becomes 123.127 by rounding up
			// the 5 totasl spaces does no work, it was considered but the 123 is more than the requested 5 spaces
			// same thing if %7.3f total spaces will be7 and if 1.12, itll give you "  1.120" 2 spaces in front
		System.out.printf("First is:%.2f second is:%.2f multiplication is:%.2f\n",num1,num2,result);
		System.out.printf("First is:%5.3f second is:%5.3f multiplication is:%5.3f\n",num1,num2,result);
		System.out.printf("First is:%2.1f second is:%2.1f multiplication is:%2.1f\n",num1,num2,result);
	

	
	}
}