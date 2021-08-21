package ch21;

public class ObjectDeepCopyTest {

	public static void main(String[] args) {

		/*
		 * 얕은 복사(shallow copy) vs 깊은 복사(deep copy)
		 */

		/*
		 * 2. 깊은 복사(deep copy)
		 * 얕은 복사가 복합객체(리스트)만 복사되고 그 안의 내용은 동일한 객체를 참조한다면, 
		 * 깊은 복사의 경우에는 복합객체를 새롭게 생성하고 
		 * 그 안의 내용까지 재귀적으로 새롭게 생성하게 됩니다.
		 * 그래서 깊은 복사를 하게 되면, 처음에 만들었던 객체와 복사된 객체가 
		 * 전혀 달라지기 때문에 어느 한쪽을 수정한다고 해서 다른 한쪽이 영향 받는 일은 없게되겠죠.
		 */
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();

		for (int i = 0; i < library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}

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
