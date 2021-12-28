public class multiplicationtable{
	
	public static void main(String args[]){
		
		//multiplicationtable from 1 to 10 rows and cols
		for(int i =1;i<=10;i++){ //rows
			for (int j=1; j<=10;j++){ //columns
				System.out.print((i*j) + "\t");
			}
			System.out.println();

		}
	}
}