public class forloopnest {

	public static void main (String [] args){
		
		for(int i = 1; i<=10; i++){ //for the row
			for(int x = 1; x<=10; x++){ //for the col
				System.out.print(x + "\t"); //will print 12345678910 on one  line
			}
			System.out.println(""); //this creates the next row after the 1-10 line to make 10 rows
		}
	
	}
}