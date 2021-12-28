public class Forloops {
	
	public static void main (String[] args) {
	
		/* for evens
		for(int i = 2; i <= 20; i = i+2){
			if (i %2==0){
				System.out.println(i);
			}
		}*/
		
		//for odd
		for(int i = 1; i <= 20; i = i+2){
			if (i %2!=0){
				System.out.print(i);
				if (i%3==0){
					System.out.print(" and is divisible by 3");
				}	
			}
			
		System.out.println();
		}
		
		/*
		//if divisible by 3
		for(int i = 1; i <= 20; i = i+2){
			if (i %3==0){
				System.out.println(i);
			}
		}
		*/
		
	}
}