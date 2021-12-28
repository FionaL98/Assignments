public class array1 {

	public static void main (String []args){
	
		
		//double[] grades = {60,70,90,80}; ANOTHER METHOD TO ANNOUNCING ELEMENTS AND ARRAY TOGTHER IN ONE LINE
		
		double[] grades = new double[4];
		grades[0] = 89.2;
		grades[1] = 75.0;
		grades[2] = 69.8;
		grades[3] = 85.5;
		
		double total=0;
		double avg;
		
		for (int i=0; i<grades.length; i++){
			total += grades[i];
		}
		
		avg = total / grades.length; 
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + avg);
		
		
		/*  WITH SCANNER !!! 
		Scanner in = new Scanner(System.in);
		double sum=0.0;
		double num=0.0;
		double[] grades = new double[5];

		for (int i=0;i<grades.length;i++)
		{
		System.out.print("Enter the Marks no " + (i+1)+" : ");
		grades[i] = in.nextDouble();
		sum+=grades[i];
		}
		System.out.print("\nThe total is "+sum+" The average is "+(sum/grades.length));
		*/
		
	}
}