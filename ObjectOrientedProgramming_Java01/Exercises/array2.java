public class array2 {

	public static void main (String []args){
	
		
		double[] grades = {60,70,90,80}; 
		
		double max= grades[0];
		double min= grades[0];
		
		for (int i=0; i<grades.length; i++){
			if (grades[i] > max ) {
				max = grades[i];
			} 
			
			if (grades[i] < min){
				min = grades[i];
			}
			
		}
		
		System.out.println("The max value is: " + max);
		System.out.println("The min value is: " + min);
		

		
	}
}