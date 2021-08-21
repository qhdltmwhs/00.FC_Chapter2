package ch21;

public class ObjectShallowCopyTest {

	public static void main(String[] args) {
		
		/*
		 * 얕은 복사(shallow copy) vs 깊은 복사(deep copy)
		 */
		
		/* 
		 * 1. 얕은 복사(shallow copy)
		 * 변수만 복사하다 보니 바라보는 객체는 당연히 동일하겠죠. 
		 * 즉, 두개의 변수 중 하나만 변경되어도 나머지 하나도 
		 * 동일하게 수정되는 현상이 발생하게 됩니다.
		 */
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완선");

		System.out.println("[]======Library======[]");
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}

		System.out.println("[]====CopyLibrary====[]");
		for (Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}

	}

}
