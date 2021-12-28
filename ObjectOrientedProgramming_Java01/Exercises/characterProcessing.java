public class characterProcessing {
	public static void main(String[] args) {
	
		char c1='A', c2='B', c3='4', c4=' ',c5='E';

		System.out.println(Character.compare(c1,c2));
		System.out.println(Character.compare(c2,c1));
		System.out.println(Character.compare(c5,c1));
		System.out.println(Character.isDigit(c1));
		System.out.println(Character.isDigit(c3));
		System.out.println(Character.isSpaceChar(c4));
		System.out.println(Character.isUpperCase(c1));
		System.out.println(Character.toLowerCase(c2));
		
		/* Character Class !!!
		Character c1=new Character('A');
		Character c2=new Character('B');
		Character c3=new Character('4');
		Character c4=new Character(' ');
		Character c5=new Character('E');
		System.out.println(Character.compare(c1,c2));
		System.out.println(Character.compare(c2,c1));
		System.out.println(Character.compare(c5,c1));
		System.out.println(Character.isDigit(c1));
		System.out.println(Character.isDigit(c3));
		System.out.println(Character.isSpaceChar(c4));
		System.out.println(Character.isUpperCase(c1));
		System.out.println(Character.toLowerCase(c2));
		*/
	}
}