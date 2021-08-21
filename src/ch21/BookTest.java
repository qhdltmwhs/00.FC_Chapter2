package ch21;

public class BookTest {

	public static void main(String[] args) {

		/*
		 * 객체배열생성시 배열에 객체가 할당되는게 아니며, 
		 * 객체배열의 메모리 주소값을 참조할 참조변수의 메모리가 할당됨 
		 * --> 4바이트(32비트)or 8바이트(64비트). 
		 * 객체배열 생성후 직접 객체를 생성한후 생성된 
		 * 객체의 참조값을 객체배열 참조변수에대입해야한다.
		 */
		Book[] library = new Book[5];

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		System.out.println();

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}

	}

}
