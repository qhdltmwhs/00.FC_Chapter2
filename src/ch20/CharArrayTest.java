package ch20;

public class CharArrayTest {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A';

		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
		}

		for (int i = 0; i < alphabets.length; i++) {
			System.out.print(alphabets[i]+ " ");
		}
		System.out.println();
		
		for (char alpha : alphabets) {
			System.out.print(alpha+ " ");
		}
		System.out.println();
		
		for (char alpha : alphabets) {
			System.out.print((int) alpha + " ");
		}
		System.out.println();

	}

}
