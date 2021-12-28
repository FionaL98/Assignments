public class array100{

	public static void main (String []args){
	
		int[] num = new int[10];
			
		System.out.print("All elements: ");

		for (int i=0; i<num.length; i++){
			num[i] = 100*(i+1);
			
			System.out.print(num[i] + " ");
		}
		System.out.println("");
		
		System.out.print("Divisible by 3: ");
		for (int i=0; i<num.length; i++){
			if (num[i] % 3 ==0){
				System.out.print(num[i] + ", ");
			}
			
		}

		

		
	}
}